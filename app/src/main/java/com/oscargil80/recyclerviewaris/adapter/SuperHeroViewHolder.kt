package com.oscargil80.recyclerviewaris.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.oscargil80.recyclerviewaris.SuperHero
import com.oscargil80.recyclerviewaris.databinding.ItemSuperheroBinding


class SuperHeroViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)


    fun render(superHeroModel:SuperHero,  onClickListener: (SuperHero) -> Unit){
        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)

        itemView.setOnClickListener {onClickListener(superHeroModel)    }

    }


}