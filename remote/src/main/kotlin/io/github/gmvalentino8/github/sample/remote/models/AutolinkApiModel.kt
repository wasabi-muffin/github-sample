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
 * An autolink reference.
 * @param id 
 * @param keyPrefix The prefix of a key that is linkified.
 * @param urlTemplate A template for the target URL that is generated if a key was found.
 */
@Serializable
data class AutolinkApiModel(
    @SerialName(value = "id")
    val id: kotlin.Int,
    /* The prefix of a key that is linkified. */
    @SerialName(value = "key_prefix")
    val keyPrefix: kotlin.String,
    /* A template for the target URL that is generated if a key was found. */
    @SerialName(value = "url_template")
    val urlTemplate: kotlin.String
) {

}

