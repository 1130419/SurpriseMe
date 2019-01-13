package com.surprise.me.cucumber.stepdefs;

import com.surprise.me.SurpriseMeApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SurpriseMeApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
