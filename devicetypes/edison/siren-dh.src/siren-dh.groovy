/**
 *  Siren DH
 *
 *  Copyright 2016 KV
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "Siren DH", namespace: "edison", author: "KV", oauth: true) {
		capability "Audio Notification"
		capability "Door Control"
		capability "Motion Sensor"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'door' attribute
	// TODO: handle 'motion' attribute

}

// handle commands
def playText() {
	log.debug "Executing 'playText'"
	// TODO: handle 'playText' command
}

def playTextAndResume() {
	log.debug "Executing 'playTextAndResume'"
	// TODO: handle 'playTextAndResume' command
}

def playTextAndRestore() {
	log.debug "Executing 'playTextAndRestore'"
	// TODO: handle 'playTextAndRestore' command
}

def playTrack() {
	log.debug "Executing 'playTrack'"
	// TODO: handle 'playTrack' command
}

def playTrackAndResume() {
	log.debug "Executing 'playTrackAndResume'"
	// TODO: handle 'playTrackAndResume' command
}

def playTrackAndRestore() {
	log.debug "Executing 'playTrackAndRestore'"
	// TODO: handle 'playTrackAndRestore' command
}

def open() {
	log.debug "Executing 'open'"
	// TODO: handle 'open' command
}

def close() {
	log.debug "Executing 'close'"
	// TODO: handle 'close' command
}