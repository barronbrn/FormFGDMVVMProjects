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
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OutputFragment : Fragment() {

    private lateinit var binding: FragmentOutputBinding

    private val viewModel: AttendanceViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOutputBinding.inflate(inflater, container, false)

        viewModel.attendanceList.observe(viewLifecycleOwner) { list ->
            binding.txtViewOutput.text = list.joinToString("\n\n"){
                "Nama: ${it.nama}\n"+
                "No HP: ${it.phone}\n"+
                "Email: ${it.email}\n"+
                "Jenis Kelamin:  ${it.gender}\n"+
                "Skill: ${it.skillset}\n" +
                "Kategori: ${it.kategori}"
            }
        }

        return binding.root
    }

}