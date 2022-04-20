package properties

interface IProperties {
    fun getUrl(): String
    fun getSubUrl(subUrl: String): String
    fun getHeader(key: String): String
    fun getParameter(key: String): String
}