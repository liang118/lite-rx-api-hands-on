package io.pivotal.literx;

import reactor.core.publisher.Flux;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

	Flux<String> emptyFlux() {
		return Flux.empty();
	}

//========================================================================================

	Flux<String> fooBarFluxFromValues() {
		return Flux.just("foo", "bar");
	}

//========================================================================================

	Flux<String> fooBarFluxFromList() {
		return Flux.fromArray(new String[]{"foo", "bar"});
	}

//========================================================================================

	Flux<String> errorFlux() {
		return Flux.error(new Throwable(new IllegalStateException()));
	}

//========================================================================================

		// TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
	Flux<Long> counter() {
		//hard
		return null;
	}

}
