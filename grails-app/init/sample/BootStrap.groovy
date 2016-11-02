package sample

class BootStrap {

    def init = { servletContext ->
        Dummy.withTransaction {
            new Dummy(name: "dummy").save()
        }
    }
    def destroy = {
    }
}
