package io.pivotal.literx;

import reactor.core.publisher.Mono;

/**
 * Learn how to create Mono instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html">Mono Javadoc</a>
 */
public class Part02Mono {

//========================================================================================

	Mono<String> emptyMono() {
		return null;
	}

//========================================================================================

	Mono<String> monoWithNoSignal() {
		return Mono.never();
	}

//========================================================================================

	Mono<String> fooMono() {
		return null;
	}

//========================================================================================

	// TODO Create a Mono that emits an IllegalStateException
	Mono<String> errorMono() {
		return null;
	}

}
