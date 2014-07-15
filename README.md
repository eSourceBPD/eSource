eSource README
==============

We use Eclipse for development.


Building
-----
To build with Maven in Eclipse, simply right click your project under the Project Explorere window and select "Run as ... Maven Install". That should build the proper jar file.


Commit Guidelines
-----------------

Commits should fall into one of 3 areas:

- `[Feature]`: Commits which are features should start with `[Feature]` and followed by a quick summary on the top line, followed by some extra details in the commit body.

- `[Fix]`: Commits which fix bugs, or minor improvements to existing features should start with `[Fix]` and followed by a quick summary on the top line, followed by some extra details in the commit body.

- Commits which fix bugs caused by previous commits (since last release), or otherwise make no functionality changes, should have no prefix.  These will not be added to the project change log.
