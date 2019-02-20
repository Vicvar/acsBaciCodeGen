# ACS Characteristic Component Code Generation

Code generation prototipe for ACS (ALMA Common Software) monitoring points implementation and deployment using EMF and Acceleo.

## Getting Started

The generation is done by creating an instance of the ecore metamodel. This can be done by running the generated editor project as an eclipse plugin. Ideally the editor should be launched as a plug-in. Then the Acceleo project must be configured and run, and the implementation file must be completed.
The file for the Acceleo launch configuration is included, yet it has to be changed to work with a different instance file (.bacigenmodel). In the future, the generator could also be launched as a runnable jar to wich the instance file and target folder should be passed as arguments.

### Prerequisites

The projects were created in Eclipse 4.6, latest version compatible with Acceleo at the time of the creation of thsi project (according to Wikipedia). EMF(2.12), and Acceleo(3.7.7) must be installed.


