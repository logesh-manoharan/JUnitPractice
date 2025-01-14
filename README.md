GitHub: https://github.com/in28minutes/

JUnit:
	
	Design -> Write Code -> Testing(Manually)         WITHOUT JUNIT
	Design -> Write Code -> Write Test -> Run Test    WITH JUNIT

	How it differ from Manual Testing using main() function ?
		We are providing the way to test the code in Future as well. So, that if someone make changes in your code
		verifying it manually will not make sense. Instead they can run the test. 
		



Stub - Fake Object

	Where can we use this Stub ?
		If we like to create objects of any dependent classes. [We only create Mock Object for Dependency classes.]
		
		
	// Created Mock Object for CalcService class
	CalcService service = new CalcService(){
		int add (int a, int b) {
			return 0;
		}
	};
	
	// Sample Stub Class to provide Dummy data or Mock data:
	public class BoardGamesStubs implements ExternalService {

		@Override
		public List<String> getBoardGames() {
			return List.of("Chess", "Carom", "Ludo");
		}
	}

	
	
Disadvantages of Stubs:

1.Dynamic Condition - If input parameter/conditions changes. We need to separate IF checks
for every input. It will raise to create Boiler plate code.
2.Service Definition - We need to define every method from the service.
