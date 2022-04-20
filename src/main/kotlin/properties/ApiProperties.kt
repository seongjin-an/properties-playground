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

    override fun getUrl(): String {
        return api["url"].toString()
    }

    override fun getSubUrl(subUrl: String): String {
        val subUrls = api["subUrls"] as Map<String, Any>
        return subUrls[subUrl].toString()
    }

    override fun getHeader(key: String): String {
        val headers = api["headers"] as Map<String, Any>
        return headers[key].toString()
    }

    override fun getParameter(key: String): String {
        val parameters = api["params"] as Map<String, Any>
        return parameters[key].toString()
    }


}