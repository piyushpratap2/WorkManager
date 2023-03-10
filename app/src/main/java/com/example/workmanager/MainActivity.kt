package com.example.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uploadWorkRequest: WorkRequest = OneTimeWorkRequestBuilder<BlurWorker>().build()


        WorkManager.getInstance(this).enqueue(uploadWorkRequest)
    }
}