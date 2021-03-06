package io.github.gmvalentino8.github.sample.remote.utils

/**
 * Filter repo name
 *
 * Extension to get a substring from a Github url
 *
 * @param startPathDelimiter path until substring
 * @param endPathDelimiter path after substring
 */
fun String.filterRepoName(startPathDelimiter: String = "repos", endPathDelimiter: String) =
    substringAfter("https://api.github.com/$startPathDelimiter/").substringBefore("/$endPathDelimiter")
