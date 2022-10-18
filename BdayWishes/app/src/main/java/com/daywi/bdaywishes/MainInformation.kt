package com.daywi.bdaywishes

import com.daywi.bdaywishes.ConstantsForInfo.infoList

data class Info (
    var cover: Int,
    var subTitle: String,
    var title: String,
    var description: String,
    val id: Int? = infoList.size
)