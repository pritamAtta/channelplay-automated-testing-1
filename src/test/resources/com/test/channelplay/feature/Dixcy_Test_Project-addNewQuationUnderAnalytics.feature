
Feature: Dixcy Test Project - add new quation under analytics

		
		Background: 
				Given the user select Dixcy Test Project
				And select analytics
				And select quation 
				
				Scenario: add new quation with all fields
						When user select add button 
						And input values in all fields 
						And hit save button
						And user select add product button
						And user add product with Usage as Pump

						Then quation created successfully message will show
					
				Scenario: verify new quation has been created with all given data
						When user search with new created quation
						Then searched quation will show 
						And user select action button for that quation 
						Then quation will open on edit mode

					When new line add by Pritam Atta
						