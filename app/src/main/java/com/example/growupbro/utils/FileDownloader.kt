package com.example.growupbro.utils

import android.content.ContentValues
import android.content.Context
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import com.example.growupbro.data.Plant

object FileDownloader {

    fun createAndSaveFile(context: Context, plant: Plant) {
        val filename = plant.name + ".txt"

        val fileContent = buildString {
            appendLine(plant.name)
            appendLine()
            appendLine("Характеристики:")
            appendLine("Сложность в уходе: " + plant.careDifficulty.displayName)
            appendLine("Освещение: " + plant.sunlightNeed.displayName)
            appendLine("Полив: " + plant.waterNeed.displayName)
            appendLine("Температура: " + plant.temperatureNeed.displayName)
            appendLine("Размер: " + plant.size.displayName)
            appendLine("Безопасность: " + plant.isSafe.displayName)
            if (plant.otherFeatures.isEmpty()) {
                appendLine("Другие характеристики: нет")
            } else {
                appendLine("Другие характеристики: " + plant.otherFeatures.joinToString(", ") { it.displayName })
            }
            appendLine()
            appendLine("Описание:")
            appendLine(plant.description)
        }

        val mimeType = "text/plain"
        val location = Environment.DIRECTORY_DOCUMENTS + "/GrowUpBro"
        val resolver = context.contentResolver

        val fileParams = ContentValues().apply {
            put(MediaStore.MediaColumns.DISPLAY_NAME, filename)
            put(MediaStore.MediaColumns.MIME_TYPE, mimeType)
            put(MediaStore.MediaColumns.RELATIVE_PATH, location)
        }

        val uri = resolver.insert(MediaStore.Files.getContentUri("external"), fileParams)

        if (uri != null) {
            resolver.openOutputStream(uri)?.use { outputStream ->
                outputStream.write(byteArrayOf(0xEF.toByte(), 0xBB.toByte(), 0xBF.toByte()))
                outputStream.writer(Charsets.UTF_8).use { writer ->
                    writer.write(fileContent)
                }
            }
            Toast.makeText(context, "Файл сохранён в " + location, Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Не удалось создать файл", Toast.LENGTH_LONG).show()
        }
    }
}
