package config

import org.yaml.snakeyaml.Yaml
import java.io.FileReader

class RootConfig {
    companion object {
        fun configurePath(): Map<String, Any>{
            val home = System.getenv("HOME")
            val props: Map<String, Any> = Yaml().load(FileReader("${home}/properties.yml"))
            return props
        }
    }
}