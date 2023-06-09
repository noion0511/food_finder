package com.ssafy.foodfind.data.entity

import com.ssafy.foodfind.R
import java.io.Serializable
import java.sql.Timestamp

enum class OrderStatus {
    RECEIVED, COOKING, DONE, CANCEL
}

data class Order(
    val orderId: Int,
    val userId: Int,
    val truckId: Int,
    var name: String,
    var customerName: String,
    val description: String?,
    val totalPrice: Int,
    val orderTime: String,
    var orderStatus: OrderStatus,
    var items: List<OrderCount>,
    var customerPhone : String,
    var ownerPhone : String,
) {

    fun getStatusText(): String {
        return when (orderStatus) {
            OrderStatus.RECEIVED -> "주문 접수됨"
            OrderStatus.COOKING -> "조리중"
            OrderStatus.DONE -> "완료"
            OrderStatus.CANCEL -> "주문 취소됨"
        }
    }
    fun getStatusColor(): Int {
        return when (orderStatus) {
            OrderStatus.RECEIVED -> R.color.received
            OrderStatus.COOKING -> R.color.white
            OrderStatus.DONE -> R.color.done
            OrderStatus.CANCEL -> R.color.cancel
        }
    }

    fun getDateTime(): String {
        return orderTime.split("T")[0]
    }
}

data class OrderDetail(val item: FoodItem, var count: Int) : Serializable

data class OrderCount(
    val itemId: Int = 0,
    val orderId: Int = 0,
    val orderItemId: Int = 0,
    var quantity: Int = 0,
) :
    Serializable
