import org.util.Util

def call(Map config = [:]) {
    def util = new Util(this)
    util.run(config.message)
}
