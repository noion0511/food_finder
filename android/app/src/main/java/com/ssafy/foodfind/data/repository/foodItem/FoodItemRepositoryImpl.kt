package com.ssafy.foodfind.data.repository.foodItem

import com.ssafy.foodfind.data.entity.ErrorResponse
import com.ssafy.foodfind.data.entity.FoodItem
import com.ssafy.foodfind.data.network.ApiService
import com.ssafy.foodfind.data.network.NetworkResponse
import javax.inject.Inject

class FoodItemRepositoryImpl @Inject constructor(
	private val apiService: ApiService
) : FoodItemRepository{
	override suspend fun getFoodItemResponseByTruckId(truckId: Int): NetworkResponse<List<FoodItem>, ErrorResponse> {
		return apiService.getFoodItemsResponseByTruckId(truckId)
	}

	override suspend fun insertFoodItemResponse(foodItem: FoodItem): NetworkResponse<Boolean, ErrorResponse> {
		return apiService.insertFoodItemResponse(foodItem)
	}

	override suspend fun updateFoodItemResponse(foodItem: FoodItem): NetworkResponse<Boolean, ErrorResponse> {
		return apiService.updateFoodItemResponse(foodItem)
	}

	override suspend fun updateFoodItemToNotUseResponse(itemId: Int): NetworkResponse<Boolean, ErrorResponse> {
		return apiService.updateFoodItemToNotUseResponse(itemId)
	}

	override suspend fun insertAllFoodItemsResponse(foodItems: List<FoodItem>): NetworkResponse<Unit, ErrorResponse> {
		return apiService.insertAllFoodItemResponse(foodItems)
	}
}