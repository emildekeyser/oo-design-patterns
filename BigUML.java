

/* Strategy */

public interface Strategy
{
	public int compute(int a);
}

public class Computer
{
	private Strategy strat;

	public void setStrategy(Strategy strat){}

	public int compute(String strat, int a){}
}

public class StratA implements Strategy
{
	public int compute(int a){}
}

public class StratB implements Strategy
{
	public int compute(int a){}
}

/* Observer */

public interface Observer
{
	public void update(Observable o);
}

public interface Observable
{
	private void notifyObservers();

	public void register(Observer o);
	public void unRegister(Observer o);
}


public interface Observer
{
	public void update(Observable o);
}

public interface Observable
{
	private void notifyObservers();

	public void register(Observer o);
	public void unRegister(Observer o);
}

public class ObserverA
{
	public void update(Observable o){}
}

public class ObserverB
{
	public void update(Observable o){}
}

public class ObserverC
{
	public void update(Observable o){}
}

public class ObservableAA
{
	private List<Observer> observers;

	private void notifyObservers(){}

	public void stateUpdate(){}

	public void register(Observer o){}
	public void unRegister(Observer o){}
}

/* Factory */

public class SimpleFactory
{
	public CompObj makeComplicatedObject(){}
}

/* Singleton */

public class Singleton
{
	private Singleton uniqueInstance;
	private void Singleton(){}

	public static Singleton getInstance(){}
}

public interface State
{
	public void gotoA();
	public void gotoB();
	public void gotoC();
	public void gotoD();
	public void gotoE();
}

public class StateA implements State
{
	public void gotoA(StateAutomaton automaton){}
	public void gotoB(StateAutomaton automaton){}
	public void gotoC(StateAutomaton automaton){}
	public void gotoD(StateAutomaton automaton){}
	public void gotoE(StateAutomaton automaton){}
}

public class StateB implements State
{
	public void gotoA(StateAutomaton automaton){}
	public void gotoB(StateAutomaton automaton){}
	public void gotoC(StateAutomaton automaton){}
	public void gotoD(StateAutomaton automaton){}
	public void gotoE(StateAutomaton automaton){}
}

public class StateC implements State
{
	public void gotoA(StateAutomaton automaton){}
	public void gotoB(StateAutomaton automaton){}
	public void gotoC(StateAutomaton automaton){}
	public void gotoD(StateAutomaton automaton){}
	public void gotoE(StateAutomaton automaton){}
}

public class StateD implements State
{
	public void gotoA(StateAutomaton automaton){}
	public void gotoB(StateAutomaton automaton){}
	public void gotoC(StateAutomaton automaton){}
	public void gotoD(StateAutomaton automaton){}
	public void gotoE(StateAutomaton automaton){}
}

public class StateE implements State
{
	public void gotoA(StateAutomaton automaton){}
	public void gotoB(StateAutomaton automaton){}
	public void gotoC(StateAutomaton automaton){}
	public void gotoD(StateAutomaton automaton){}
	public void gotoE(StateAutomaton automaton){}
}


public class StateAutomaton implements State
{
	private StateA stateA;
	private StateB stateB;
	private StateC stateC;
	private StateD stateD;
	private StateE stateE;

	private StateE curentState;

	public void gotoA(){}
	public void gotoB(){}
	public void gotoC(){}
	public void gotoD(){}
	public void gotoE(){}

	public void setStateA(){}
	public void setStateB(){}
	public void setStateC(){}
	public void setStateD(){}
	public void setStateE(){}
}

/* Facade */

public class Facade
{
	// These do many things
	public void doA(){}
	public void doB(){}
	public void doC(){}
	public void doD(){}
	public void doE(){}
}

/* Adapter */


public interface Target
{
	public void doA();
	public void doB();
	public void doC();
}

public interface Me
{
	public void doX();
	public void doY();
}

public class Adapter implements Target
{
	private Me me;

	// These use Me
	public void doA();
	public void doB();
	public void doC();
}

/* Decorator */

public interface Thing
{
	public void doA();
	public void doB();
}

public class ConcreteThing
{
	public void doA(){}
	public void doB(){}
}

public abstract class ThingDecorator implements Thing
{
	public abstract void doA();
	public abstract void doB();
}

public class DoinkDecorator extends ThingDecorator
{
	@Override
	public void doA(){}
	@Override
	public void doB(){}
}