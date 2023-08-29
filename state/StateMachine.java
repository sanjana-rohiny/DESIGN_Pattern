
 
public abstract class StateMachine {

// the handler class in intentionally avoided.

	State[] stateTable;
	int statePosition;
	State currentState;
 	
	abstract void quit();
 
	public StateMachine() {
		statePosition = 0;
		stateTable = new State[10];
	}

	void addState(State state) {
		stateTable[statePosition] = state;
		statePosition += 1;
	}

	void initializeState(State state) {
		currentState = state;	
		currentState.enter();	
	}

	void changeState(State newState) {
		currentState = newState;
		currentState.enter();
	}

	void sendMessage(int Msg) {			
		currentState.handle(Msg);
	} 
		
	void exit() {
		for(int i=0; i<statePosition; i++) {
			stateTable[i].exit();			
		}
	}
}
