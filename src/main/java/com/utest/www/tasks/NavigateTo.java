package com.utest.www.tasks;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


    public class NavigateTo implements Task {
        private PageObject page;

        public NavigateTo(PageObject page) {
            this.page = page;
        }

        public static NavigateTo on(PageObject page) {
            return Tasks.instrumented(NavigateTo.class, page);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Open.browserOn(page));
        }
}
