/**
 * GitHub v3 REST API
 *
 * GitHub's v3 REST API.
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.github.gmvalentino8.github.sample.remote.models


import kotlinx.serialization.*

/**
 * 
 * @param limit 
 * @param remaining 
 * @param reset 
 * @param used 
 */
@Serializable
data class RateMinusLimitApiModel(
    @SerialName(value = "limit")
    val limit: kotlin.Int,
    @SerialName(value = "remaining")
    val remaining: kotlin.Int,
    @SerialName(value = "reset")
    val reset: kotlin.Int,
    @SerialName(value = "used")
    val used: kotlin.Int
) {

}

