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
 * @param message The message for the pull request review dismissal
 * @param event 
 */
@Serializable
data class InlineObject127ApiModel(
    /* The message for the pull request review dismissal */
    @SerialName(value = "message")
    val message: kotlin.String,
    @SerialName(value = "event")
    val event: kotlin.String? = null
) {

}

