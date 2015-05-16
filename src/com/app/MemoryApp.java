package com.app;

import com.ctxengine.ContextEngine;
import com.ctxengine.sensors.ICtxUpdated;

/**
 * @author shinda
 * 
 */
public class MemoryApp implements ICtxUpdated {

	protected ContextEngine ctxEngine;

	/**
	 * Constructor. This constructor simply instantiates its own context engine.
	 * 
	 */
	public MemoryApp() {
		ctxEngine = new ContextEngine(this);
	}

	/******************************************************************
	 * ICtxUpdated implementation
	 ******************************************************************/

	/**
	 * Below are all the methods declared in the ICtxUpdated interface. Right
	 * now these are naive implementations of these methods, which do nothing.
	 * <p>
	 * To build an application, create a new class that extends to this class,
	 * i.e., MemoryApp. Then simply override the context events that are of
	 * interest, such as IMU events for StoryBall.
	 */

	@Override
	public void OnBoardIMUShakeDetected() {

	}

	@Override
	public void OnBoardCameraFaceDetected() {

	}

	@Override
	public void OffBoardActivityNoneDetected() {

	}

	@Override
	public void OffBoardActivityLowDetected() {

	}

	@Override
	public void OffBoardActivityHighDetected() {

	}

	@Override
	public void OffBoardSpeechNoneDetected() {

	}

	@Override
	public void OffBoardSpeechLowDetected() {

	}

	@Override
	public void OffBoardSpeechHighDetected() {

	}

}