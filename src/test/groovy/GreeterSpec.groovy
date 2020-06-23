import com.fabianromero.Greeter
import spock.lang.Specification
import spock.lang.Unroll


class GreeterSpec extends Specification {

    @Unroll
    def "When I call the greeter method with a name, it must say hello using the name"() {
        given: "A new name to call greet and a greeter"
        def name = "Fabián"
        def greeter = new Greeter()

        when: "When greeter is called"
        def response = greeter.greet(name)

        then: "System must greet using the name"
        response == "Hello, Fabián!"
    }

}