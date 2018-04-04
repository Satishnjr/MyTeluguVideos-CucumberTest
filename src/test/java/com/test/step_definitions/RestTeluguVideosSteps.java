package com.test.step_definitions;

import com.test.modules.RestTeluguVideosAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RestTeluguVideosSteps {
	String resp;

	@Given("^user open videos Json Url in Telugu Videos Website$")
	public void user_open_videos_Json_Url_in_Telugu_Videos_Website()
			throws Throwable {

		resp = RestTeluguVideosAction
				.callRESTService("http://www.myteluguvideos.com/movies.json");

	}

	@Then("^user verify atleat 50 videos$")
	public void user_verify_atleat_50_videos() throws Throwable {

		RestTeluguVideosAction.testJson(resp);

	}
}
