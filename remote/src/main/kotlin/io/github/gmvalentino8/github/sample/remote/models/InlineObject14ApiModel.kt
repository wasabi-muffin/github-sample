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
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * 
 * @param text The Markdown text to render in HTML.
 * @param mode The rendering mode. Can be either `markdown` or `gfm`.
 * @param context The repository context to use when creating references in `gfm` mode.  For example, setting `context` to `octo-org/octo-repo` will change the text `#42` into an HTML link to issue 42 in the `octo-org/octo-repo` repository.
 */
@Serializable
data class InlineObject14ApiModel(
    /* The Markdown text to render in HTML. */
    @SerialName(value = "text")
    val text: kotlin.String,
    /* The rendering mode. Can be either `markdown` or `gfm`. */
    @SerialName(value = "mode")
    val mode: InlineObject14ApiModel.Mode? = Mode.markdown,
    /* The repository context to use when creating references in `gfm` mode.  For example, setting `context` to `octo-org/octo-repo` will change the text `#42` into an HTML link to issue 42 in the `octo-org/octo-repo` repository. */
    @SerialName(value = "context")
    val context: kotlin.String? = null
) {

    /**
     * The rendering mode. Can be either `markdown` or `gfm`.
     * Values: markdown,gfm
     */
    @Serializable(with = Mode.Serializer::class)
    enum class Mode(val value: kotlin.String) {
        markdown("markdown"),
        gfm("gfm");

        @kotlinx.serialization.Serializer(forClass = Mode::class)
        object Serializer {
            override fun deserialize(decoder: Decoder): Mode {
                val decoded = decoder.decodeString()
                return values().first { it.value == decoded }
            }

            override val descriptor: SerialDescriptor
                get() = PrimitiveSerialDescriptor(
                    "InlineObject14ApiModel.Mode.Serializer",
                    PrimitiveKind.STRING
                )

            override fun serialize(encoder: Encoder, value: Mode) {
                return encoder.encodeString(value.value)
            }
        }
    }
}

