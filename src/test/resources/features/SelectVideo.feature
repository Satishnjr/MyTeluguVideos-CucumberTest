Feature: Videos in Telugu Videos Site 

@ClickVideo
Scenario: Select Video in trailer nav 
	When user open Telugu Videos website 
	And user click on Trailers Nav Link 
	Then user click on Video 

@PlayVideo	
Scenario: Select Video and land on home page 
	When user open Telugu Videos website 
	And user click on Trailers Nav Link 
	And user click on Video, Video Should Play 
	Then user click on Overview, Should go for Home Page 
