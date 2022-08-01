package com.overman.maxlogging

import android.util.Log

object Lg {
    private fun logMsg(msg: String): String {
        val stack = Throwable().stackTrace
        val currentStack = stack[2]
        return currentStack.className + "\t[Line:" + currentStack.lineNumber + "]\t" +
                currentStack.methodName + " -> " + msg
    }

    fun v(msg: String) {
        if (MaxLogging.test) {
            Log.v(MaxLogging.tag, logMsg(msg))
        }
    }

    fun v(tag: String?, msg: String) {
        if (MaxLogging.test) {
            Log.v(tag, logMsg(msg))
        }
    }

    fun d(msg: String) {
        if (MaxLogging.test) {
            Log.d(MaxLogging.tag, logMsg(msg))
        }
    }

    fun d(tag: String?, msg: String) {
        if (MaxLogging.test) {
            Log.d(tag, logMsg(msg))
        }
    }

    fun e(msg: String) {
        if (MaxLogging.test) {
            Log.e(MaxLogging.tag, logMsg(msg))
        }
    }

    fun e(tag: String?, msg: String) {
        if (MaxLogging.test) {
            Log.e(tag, logMsg(msg))
        }
    }

    fun e(msg: String, throwable: Throwable?) {
        if (MaxLogging.test) {
            Log.e(MaxLogging.tag, logMsg(msg), throwable)
        }
    }

    fun e(tag: String?, msg: String, throwable: Throwable?) {
        if (MaxLogging.test) {
            Log.e(tag, logMsg(msg), throwable)
        }
    }

    fun i(msg: String) {
        if (MaxLogging.test) {
            Log.i(MaxLogging.tag, logMsg(msg))
        }
    }

    fun i(tag: String?, msg: String) {
        if (MaxLogging.test) {
            Log.i(tag, logMsg(msg))
        }
    }

    fun i(tag: String?, msg: String, throwable: Throwable?) {
        if (MaxLogging.test) {
            Log.i(tag, logMsg(msg), throwable)
        }
    }
}