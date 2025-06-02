package com.example.formfgdmvvmprojects.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.formfgdmvvmprojects.model.AttendanceModel

class AttendanceViewModel : ViewModel() {
    private val _attendanceData = MutableLiveData<AttendanceModel>()
    val attendanceData: LiveData<AttendanceModel> get() = _attendanceData

    //Fungsi untuk Menyimpan data Anggota
    fun setAttendanceData(model: AttendanceModel) {
        _attendanceData.value = model
    }



}