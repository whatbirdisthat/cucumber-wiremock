package net.tqxr.steps

import cucumber.api.PendingException
import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Given(~/^the "([^"]*)" endpoint at "([^"]*)"$/) { String serviceName, String endpointUrl ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

When(~/^a request is made to the endpoint$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Then(~/^a "([^"]*)" object is returned$/) { String className ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}