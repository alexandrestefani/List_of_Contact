package com.alexandrestefani.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alexandrestefani.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val contactInfoList: MutableList<ContactInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.lista
        listView.layoutManager = LinearLayoutManager(this)

        listView.adapter = ListAdapter(contactInfoList)

        createContactData()

    }
    private fun createContactData(){
        contactInfoList.add(ContactInfo("Alexandre","911111111"))
        contactInfoList.add(ContactInfo("Alexsandro","911111112"))
        contactInfoList.add(ContactInfo("Amanda","911111113"))
        contactInfoList.add(ContactInfo("Antonio","911111114"))
        contactInfoList.add(ContactInfo("Alencar","911111115"))
        contactInfoList.add(ContactInfo("Lucas","911111116"))
        contactInfoList.add(ContactInfo("Marisa","911111117"))
        contactInfoList.add(ContactInfo("Ana","911111118"))
        contactInfoList.add(ContactInfo("Paulo","911111119"))
        contactInfoList.add(ContactInfo("Pedro","911111120"))
        contactInfoList.add(ContactInfo("Mauricio","911111121"))
        contactInfoList.add(ContactInfo("Silvio","911111122"))
        contactInfoList.add(ContactInfo("Felippe","911111123"))
        contactInfoList.add(ContactInfo("Fabio","911111124"))
        contactInfoList.add(ContactInfo("Vivian","911111125"))
        contactInfoList.add(ContactInfo("ingrid","911111126"))
        contactInfoList.add(ContactInfo("Renata","911111127"))
        contactInfoList.add(ContactInfo("Silas","911111128"))
        contactInfoList.add(ContactInfo("Bruno","911111129"))
        contactInfoList.add(ContactInfo("Camila","911111130"))
        contactInfoList.add(ContactInfo("Fernanda","911111131"))
        contactInfoList.add(ContactInfo("Fernando","911111132"))
        contactInfoList.add(ContactInfo("Rodrigo","911111133"))
        contactInfoList.add(ContactInfo("Tiago","911111134"))
        contactInfoList.add(ContactInfo("Sandra","911111135"))
        contactInfoList.add(ContactInfo("Tais","911111136"))
        contactInfoList.add(ContactInfo("Camila B.","911111137"))
        contactInfoList.add(ContactInfo("Maria Cecilia","911111138"))
        contactInfoList.add(ContactInfo("Marcelo","911111139"))
        contactInfoList.add(ContactInfo("Claudio","911111140"))
        contactInfoList.add(ContactInfo("Ricardo","911111141"))


    }

}