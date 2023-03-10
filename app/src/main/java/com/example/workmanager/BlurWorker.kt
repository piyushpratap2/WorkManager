package com.example.workmanager

import android.content.Context
import android.graphics.BitmapFactory
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class BlurWorker(context: Context,parameters: WorkerParameters): Worker(context,parameters) {
    override fun doWork(): Result {
       Log.d("Worker class","It is working")
        return Result.success()
    }
}