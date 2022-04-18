package properties

import config.RootConfig

class ApiProperties(var apiKey: String) : IProperties {
    private var props: Map<String, Any>
    private var api: Map<String, Any>

    init {
        val props: Map<String, Any> = RootConfig.configurePath()
        this.props = props
        val apis = props["apis"] as Map<String, Any>
        api = apis[apiKey] as Map<String, Any>
    }

    override fun getProperty(): Map<String, Any> {
        val apis = props["apis"] as Map<String, Any>
        return apis[apiKey] as Map<String, Any>
    }

    fun getUrl(): String{
        return api["url"].toString()
    }

    fun getSubUrl(subUrl: String): String {
        val subUrls = api["subUrls"] as Map<String, Any>
        return subUrls[subUrl].toString()
    }

    fun getHeader(key: String): String {
        val headers = api["headers"] as Map<String, Any?>
        return headers[key].toString()
    }

}