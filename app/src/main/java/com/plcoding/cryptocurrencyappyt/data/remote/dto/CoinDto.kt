package com.plcoding.cryptocurrencyappyt.data.remote.dto

import com.plcoding.cryptocurrencyappyt.domain.model.Coin
import kotlinx.coroutines.NonCancellable.isActive

data class CoinDto(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)


fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        is_active = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}