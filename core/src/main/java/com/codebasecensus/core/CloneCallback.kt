package com.codebasecensus.core;

/**
 * Created by kevin on 08/12/18 at 12:39
 */
interface CloneCallback {
    fun cloneSuccess()

    fun cloneFailure(reason : String)
}