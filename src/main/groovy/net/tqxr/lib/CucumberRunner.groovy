package net.tqxr.lib

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

import static cucumber.api.cli.Main.main

@Component
class CucumberRunner implements CommandLineRunner {

    @Override
    void run(String... strings) throws Exception {

        def moreStrings = new ArrayList<String>()
        Collections.addAll moreStrings, strings

        moreStrings.addAll(
                [
                        "-p",
                        "pretty",
                        "--add-plugin",
                        "html:build/cucumber-report",
                        "-g",
                        "src/main/groovy/net/tqxr/steps",
                        "classpath:features"
                ]
        )

        def stringArr = new String[moreStrings.size()]
        moreStrings.toArray stringArr

        try {
            main stringArr
        } catch (Throwable throwable) {
            throwable.printStackTrace()
        }

        println "Exception encountered, or non-zero exit code."
    }

}
