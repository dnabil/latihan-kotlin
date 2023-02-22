package com.domain.util

fun sapa(nama: String, waktu: String? = null){
    if (waktu == null){
        println("Halo $nama!")
        return
    }
    println("Halo $nama! selamat $waktu!")
}