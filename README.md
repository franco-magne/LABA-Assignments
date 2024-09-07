# LABA-Assigments

##### Assignment 7

Assignment done in TextFilesOperator class with a static method. I added the dependencies for StringUtils and FileUtils at pom.xml and a profiles.txt was created in the logs directory.


##### Assignment 6

- Add 5 collections to the hierarchy. 
	Set: Kratos, Game, 
	List: Combo, ItemMagic, Weapon
	Map: GameConfiguration

- Create custom LinkedList with generic: CustomGLinkedList

- log4J implemented with Maven at pom.xml. Configuration at: src/main/resources/log4j2.xml
- directory logs created for the log file


##### Assignment 5

I changed the domain I was working on.

Look at:
- Exceptions classes: InsufficientMagicException, InvalidUpgradeException, InvalidPathException, ObjectNotFoundException, BlockedDifficultyException
- Exceptions in 2 ways: useMagicAttack method in Kratos class & MagicAttack class; upgradeWeapon method in Weapon class & WeaponUpgrade class
- try with resources in GameConfiguration class