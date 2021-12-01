package pt.tlopes.effective.java;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import javax.inject.Inject;
import pt.tlopes.effective.java.chapter.Chapter1;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    Chapter1 chapter1;

    @Override
    public int run(String... args) throws Exception {
        chapter1.start();
        return 0;
    }
}
