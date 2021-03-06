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

import io.github.gmvalentino8.github.sample.remote.models.MarketplacePurchaseMarketplacePendingChangeApiModel
import io.github.gmvalentino8.github.sample.remote.models.MarketplacePurchaseMarketplacePurchaseApiModel

import kotlinx.serialization.*

/**
 * Marketplace Purchase
 * @param url 
 * @param type 
 * @param id 
 * @param login 
 * @param marketplacePurchase 
 * @param organizationBillingEmail 
 * @param email 
 * @param marketplacePendingChange 
 */
@Serializable
data class MarketplaceMinusPurchaseApiModel(
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "type")
    val type: kotlin.String,
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "login")
    val login: kotlin.String,
    @SerialName(value = "marketplace_purchase")
    val marketplacePurchase: MarketplacePurchaseMarketplacePurchaseApiModel,
    @SerialName(value = "organization_billing_email")
    val organizationBillingEmail: kotlin.String? = null,
    @SerialName(value = "email")
    val email: kotlin.String? = null,
    @SerialName(value = "marketplace_pending_change")
    val marketplacePendingChange: MarketplacePurchaseMarketplacePendingChangeApiModel? = null
) {

}

