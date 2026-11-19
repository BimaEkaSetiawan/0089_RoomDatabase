package com.example.pertemuan9.view.route

import com.example.pertemuan9.uicontroller.DestinasiNavigasi
import com.example.pertemuan9.R

object DestinasiDetailSiswa: DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}
