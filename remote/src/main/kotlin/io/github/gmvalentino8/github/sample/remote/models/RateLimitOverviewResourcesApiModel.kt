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

import io.github.gmvalentino8.github.sample.remote.models.RateMinusLimitApiModel

import kotlinx.serialization.*

/**
 * 
 * @param core 
 * @param search 
 * @param graphql 
 * @param sourceImport 
 * @param integrationManifest 
 * @param codeScanningUpload 
 * @param actionsRunnerRegistration 
 * @param scim 
 */
@Serializable
data class RateLimitOverviewResourcesApiModel(
    @SerialName(value = "core")
    val core: RateMinusLimitApiModel,
    @SerialName(value = "search")
    val search: RateMinusLimitApiModel,
    @SerialName(value = "graphql")
    val graphql: RateMinusLimitApiModel? = null,
    @SerialName(value = "source_import")
    val sourceImport: RateMinusLimitApiModel? = null,
    @SerialName(value = "integration_manifest")
    val integrationManifest: RateMinusLimitApiModel? = null,
    @SerialName(value = "code_scanning_upload")
    val codeScanningUpload: RateMinusLimitApiModel? = null,
    @SerialName(value = "actions_runner_registration")
    val actionsRunnerRegistration: RateMinusLimitApiModel? = null,
    @SerialName(value = "scim")
    val scim: RateMinusLimitApiModel? = null
) {

}

