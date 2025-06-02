package com.example.formfgdmvvmprojects.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.formfgdmvvmprojects.R
import com.example.formfgdmvvmprojects.databinding.FragmentInputBinding
import com.example.formfgdmvvmprojects.databinding.FragmentOutputBinding
import com.example.formfgdmvvmprojects.viewmodel.AttendanceViewModel


class OutputFragment : Fragment() {

    private lateinit var binding: FragmentOutputBinding

    private val viewModel: AttendanceViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOutputBinding.inflate(inflater, container, false)

        viewModel.attendanceData.observe(viewLifecycleOwner) { model ->
            binding.txtNamaResult.text = model.nama
            binding.txtTelefonResult.text = model.phone
            binding.txtEmailResult.text = model.email
            binding.txtGenderResult.text = model.gender
            binding.txtSkillsetResult.text = model.skillset.joinToString(", ")
            binding.txtKategoriResult.text = model.kategori
        }

        return binding.root
    }

}