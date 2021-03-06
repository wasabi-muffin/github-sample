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

import io.github.gmvalentino8.github.sample.remote.models.AppMinusPermissionsApiModel
import io.github.gmvalentino8.github.sample.remote.models.RepositoryApiModel

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Authentication token for a GitHub App installed on a user or org.
 * @param token 
 * @param expiresAt 
 * @param permissions 
 * @param repositorySelection 
 * @param repositories 
 * @param singleFile 
 * @param hasMultipleSingleFiles 
 * @param singleFilePaths 
 */
@Serializable
data class InstallationMinusTokenApiModel(
    @SerialName(value = "token")
    val token: kotlin.String,
    @SerialName(value = "expires_at")
    val expiresAt: kotlin.String,
    @SerialName(value = "permissions")
    val permissions: AppMinusPermissionsApiModel? = null,
    @SerialName(value = "repository_selection")
    val repositorySelection: InstallationMinusTokenApiModel.RepositorySelection? = null,
    @SerialName(value = "repositories")
    val repositories: kotlin.collections.List<RepositoryApiModel>? = null,
    @SerialName(value = "single_file")
    val singleFile: kotlin.String? = null,
    @SerialName(value = "has_multiple_single_files")
    val hasMultipleSingleFiles: kotlin.Boolean? = null,
    @SerialName(value = "single_file_paths")
    val singleFilePaths: kotlin.collections.List<kotlin.String>? = null
) {

    /**
     * 
     * Values: all,selected
     */
    @Serializable(with = RepositorySelection.Serializer::class)
    enum class RepositorySelection(val value: kotlin.String) {
        all("all"),
        selected("selected");

        @kotlinx.serialization.Serializer(forClass = RepositorySelection::class)
        object Serializer {
            override fun deserialize(decoder: Decoder): RepositorySelection {
                val decoded = decoder.decodeString()
                return values().first { it.value == decoded }
            }

            override val descriptor: SerialDescriptor
                get() = PrimitiveSerialDescriptor(
                    "InstallationMinusTokenApiModel.RepositorySelection.Serializer",
                    PrimitiveKind.STRING
                )

            override fun serialize(encoder: Encoder, value: RepositorySelection) {
                return encoder.encodeString(value.value)
            }
        }
    }
}

