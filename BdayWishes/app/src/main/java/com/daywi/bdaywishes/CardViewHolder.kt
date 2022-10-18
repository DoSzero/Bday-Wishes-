package com.daywi.bdaywishes

import androidx.recyclerview.widget.RecyclerView
import com.daywi.bdaywishes.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: ClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root) {

    fun bindInformation(info: Info) {
        cardCellBinding.cover.setImageResource(info.cover)
        cardCellBinding.title.text = info.title
        cardCellBinding.author.text = info.subTitle

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(info)
        }
    }
}