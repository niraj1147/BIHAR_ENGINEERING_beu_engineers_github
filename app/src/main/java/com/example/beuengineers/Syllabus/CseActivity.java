package com.example.beuengineers.Syllabus;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CseActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BranchAdapter branchAdapter;
    List<Branch> branchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        branchList = getBranches();
        branchAdapter = new BranchAdapter(branchList, this);
        recyclerView.setAdapter(branchAdapter);
    }

    private List<Branch> getBranches() {
        List<Branch> branches = new ArrayList<>();

        //1 Semester
        List<String> Chemistry = Arrays.asList("Module-1\n Atomic and Molecular Structure(10 Lectures)", "Atomic structure and its properties at atomic and sub-atomic level, Failure of classical theories to explain properties of particles, Molecular orbitals of diatomic molecules and graphs of multicentre orbitals, Principal for combination of atomic orbita;s to form molecular orbitals, Schodinger equation, Photoelectric effect and Heisenberg uncertainty principle, Dual nature of electromagnetic radiation, Planks theory, Band structure, Electromagnetic radiation, Crystal field theory and the energy level diagram for transition metals ions and their magnetic properties." ,
                "Module-2\n Spectroscopic Technique and its Applications (8 Lectures)","Principal of vibrational and rotational spectroscopy and selection rules for application in diatomic molecules, Elementary idea for elecctronic spectroscopy. UV-VIS Spectroscopy with related rules and its applications. Fluorescence and its application in medicines. Basic principle of Nuclear magnetic resonance and its applications. Basics of magnetic resonance imaging." ,
                "Module-3\n Intermolecular forces and properties of Gases (4 Lectures)","Ionic, Dipolar and Vanderwalls interactions. Equations of stste of ideal and real gases, Deviation from ideal behaviour. Vanderwalls Gas Equation.",
                "Module-4\n Use of free energy in chemical equilibriya and water chemistry (8 Lecture)","Thermodynamics functions: Energy, Enthalpy,Free energy. Equation to interrelate thermodynamics properties. Free Energy, EMF, and Cell potentials, The Nearst equation and its applications, Corrosion, Use of free energy considerations in metallurgy through ellingham diagrams. Solubility equilibria. Water chemistry hard and soft water, Parameretrs of quality of water to be used in different industries as for drinking water. Calculations of hardness of water in all units. Estimation of hardness using EDTA and Alkalinity methode. Removal of hardness by Sodalime and ion exchange methode including Zeolite Methode.",
                "Module-5\n Periodic properties (4 Lectures)","Effective Nuclear charge, Penetration of orbitals, Vibrations of s,p,d,and f orbitals energies of atom in the periodic table. Electronic configuration, Atomic and ionic size, Ionization energies,Polarisation,Acid,Base,Principal of HSAB theory, Oxidation states, Hybridisation and Moecular geometry.",
                "Module-6\n Stereochemistry (4 Lectures)","Representation of 3-D structures, Structural Isomersand stereoisomers, Diastereomers,Optical activity, Configuration and symmetry and chirality,enantiomers,Absolute configurations and confirmational analysis.",
                "Module-7\n Organic reactions and synthesis of drugs moleculed (4 lectures)","Introduction to intermediates and reaction involving substitution, Addition, Elimination, Oxidation-Reductions. Diels Elders cuclization and epoxide ring opening reactiion. Synthesis of a commonly used drug molecules like Aspirin.",
                "Practicals:\n Choose any 10-12 experiments from below","1. Determination of surface tension and viscosity.\n" +
                        "2. Thin layer chromatography.\n" +
                        "3. Ion Exchange column for removal of hardness of water.\n" +
                        "4. Determination of chloride component of water.\n" +
                        "5. Colligative properties using freezing point depression.\n" +
                        "6. Determination of rate constant of reaction.\n" +
                        "7. Determination of cell constant and conductance of solution.\n" +
                        "8. Potentiomerty-Determination of redox potential and Emfs.\n" +
                        "9. synthesis of a polymer/drug.\n" +
                        "10. Saponication/ acid value of oil.\n" +
                        "10. Chemical analysis of a salt.\n" +
                        "11. Lattice structure and packing of spheres.\n" +
                        "12. Model of potential Energy surface.\n" +
                        "13. Chemical oscillations-Iodine clock reaction.\n" +
                        "14. Adsorption of acetic acid by charcoal.\n" +
                        "15. Use of capillary viscisimeter to the demonstrate of the iso electric point as the PH of minimum viscosity.");


        List<String> MathFirst = Arrays.asList("Module 1:\n Calculus-I ( 6 Lectures )", "Evolutes and involutes, Evaluation of definite and improper integrals, Beta and Gama functions anf their properties, Application of definite integrals to evaluate surface area and volume of revolutions." ,
                "Module-2: \n Calculus-II( 6 Lectures )","Rolles theorem, Mean value theorem, Taylor and Maclaurin theorems with remainders, Intermediate forms and L-hospital rules, Maxima and Minima.",
                "Module-3: \n Sequence and Series ( 10 Lectures )","Convergence of sequence and series,Test for convergence, Power series, Taylor series, Series for Exponential, Trigonomertic and logarithmic functions, Fourier series: Half range sine and cosine series, Parsevals theorem." ,
                        "Module-4: \n Multivariable Calculus ( Differentiation )( 8 Lectures )","Limit continuty and partial Derivatives, Directional Derivatives, Total Derivatives, Tangent plane and Normal line, Maxima minima and saddle points, Methode of Lagrangemultipliers, Gradient, Curl, and Divergence.",
                        "Module-5: \n Matrices & Determinants ( 10 Lectures )","Inverse and rank of matrix, Rank-Nullity theorem, System of linear equations,Symmetric, Skew-symmertic and Orthogonal matrices. Determinants: Cayley Hamilton theorem and orthogonal transformation.");





        List<String> Pps = Arrays.asList("Module-1: \n Introduction to Programming ( 6 Lectures)", "Introduction to components of a computer system (Disks, Memory, Processor, where a program is stored and executed, Operating system, Compilers etc). Idea of Algorithm: steps to solve logical and numerical problems. Representation of Algorithm: flowchart/pseudo code with examples. from algorithms to programs; source code, variables (with data types) variables and memory locations, type casting/type conversion, run time environment (Static, Dynamic location), Storage classes (auto, Register, static, extern), syntax and logical errors in compilation, object and executable code" ,
                "Module-2: \n Operators & Conditional branching and loops (7 Lectures)","Arithmetic expressions/Arithmetic operators/Relational operators/Logical operators/Bitwise operators and Precedence\n Writing and evaluation of Conditionals and consequent branching, Iteration and loops.",
                "Module-3: \n Arrays (4 Lectures)","Array declaration and Initialisation, Bound checking arrays (1-D, 2-D), character array and Strings. ",
                "Module-4: \n Basic Algorithms (6 Lectures)","Searching (Linear search, Binary search etc.), Basic Sorting Algorithms ( Bubble, Insertion and Selection ), finding roots of equations, Notion of order of complexity through example programs (no formal definition required)." ,
                        "Module-5: \n Function (4 Lectures)","Introduction and writing functions, Scope of variables functions ( Including using fault in libraries ) Parameter passing in functions, Call by values, assing arrays to functios: Idea of call by reference." ,
                        "Module-6: \n Recursion ( 5 Lectures)","Recursion, as a different way of solving problems. Example programs, such as finding Factorial, Fibonacci series, Reverse a string using recursion, and GCD of two numbers, Ackerman function etc. Quick sort or Merge sort." ,
                        "Module-7: \n Structure/Union ( 3 Lectures )", "Structures, Accessing structure elements, Way of storage of structure elements, Defining structures and arrays of structures, Basic definition of Union, Comparison B/W Structure & Union with examples." ,
                        "Module-8: \n Pointers ( 5 Lectures )","Idea of pointers, Defining pointers, Use of pointers in self-referential structures, Notion of linked list (no implementation), Pointer to pointer, Pointer to array, Pointer to strings, Array of pointer, Pointer to function, Pointer to structure." ,
                        "Module-9: \n File Handling","( Only If time is available, Otherwise should be done as part of the LAB )" ,
                        "LAB : \n Problem solving using computers" ,
                "1. Familirisation with programming Environment.\n" +
                        "2. Variable types and type conversions ( Simple computational problems using arithematics expression ).\n" +
                        "3. Branching and Logical Expression ( Problem involving IF-THEN-ELSE structure ).\n" +
                        "4. Loops, While, Do-While and For loops ( Iterative problems e.g. Sum of series ).\n" +
                        "5. Arrays: Searching, sorting ( 1-D array manipulations ).\n" +
                        "6. 2-D Array and Strings ( matrix problem, stringg operations ).\n" +
                        "7. Functions, Call by value : ( Simple function ).\n" +
                        "8. Programming for solving numerical methode problems ( e.g. root finding ).\n" +
                        "9. Recursion, Structure of recursive calls ( Recursive functions ).\n" +
                        "10. Saponication/ acid value of oil.\n" +
                        "10. Pointers, structures and dynamic Memory allocation.\n" +
                        "11. File handling ( File Operations ).");


        List<String> Workshop = Arrays.asList("Module-1: \n Lectures ans videos(10 Lectures )","1. Manufacturing methods- Casting, Forming, Machining, Joining Advanced manufacturing methods.\n" +
                "2. CNC Machining, Additive Manufacturing.\n" +
                "3. Fitting Operations and Power tools.\n" +
                "4. Carpentary\n" +
                "5. Plastic Moulding, Glass cutting.\n" +
                "6. Metal Casting\n" +
                "7. Welding (Arc welding and Gas welding Brazing, soldering )",
                "Module-2: \n Workshop Practice ( 60 hours )","1. Machine shop and Fitting shop( 18 hrs )\n" +
                        "2. Carpentary( 6 hrs )\n" +
                        "3. Welding shop ( Arc welding + Gas welding )( 8 hrs )\n" +
                        "4. Casting and smithy( 6 hrs )\n" +
                        "5. Plastic Moulding and Glass cutting( 6 hrs )\n" +
                        "6. 3-Printing of different models ( 8 hrs )");



        List<String> English = Arrays.asList("Module-1: \n Vocabulary Building", "A. Acquantance with prefixes and suffixes from foreign languages in English to from derivatives.\n" +
                "B. Root words from foreign languages and their use in English.\n" +
                "C. A concept of word formation\n" +
                "D. Synonyms, Antonyms and standard abbreviations.\n" +
                "E. Affixes, Acronyms",
                "Module-2: \n Basic writing skills","A. Use of Tense, Use in context and coherenceof tensein writing.\n" +
                        "B. Use of phrases and Clauses in sentences.\n" +
                        "C. Importance og proper Punctuation.\n" +
                        "D. Kinds of sentences.\n" +
                        "E. Sentence Structures.\n" +
                        "F. Use of voice-Active /Passive in sentences.\n" +
                        "G. Use of speech-Direct and Indirect speech.\n" +
                        "H. Framing questions- Direct,Using modal verbs.",
                "Module-3: \n Identifying common Errors in writing","A. Subject-Verb agreement.\n" +
                        "B. Noun-Pronoun agreement.\n" +
                        "C. Misplaced modifiers\n" +
                        "D. Articles\n" +
                        "E. Prepositions, Redundancies,Cliches.\n" +
                        "F. Common english errors",
                "Module-4: \n Nature and style of sensible writing","A. Describing\n" +
                        "B. Defining\n" +
                        "C. Classifying\n" +
                        "D. Providing examples or evidence\n" +
                        "E. Writing introduction and conclusion\n" +
                        "F. Organising principle of paragraphs in documents\n" +
                        "G. Argument, Describing/ Narrating/ Planning,Defining,Classifying\n" +
                        "H. Lexical resources, using suitabble language register.\n" +
                        "I. Coherence, writing introduction,\n" +
                        "body and conclusion techniques for writing precisely,grammar and accuracy.",
                "Module-5: \n Writing practices","A. Formal letter writing/application/Report writing/writing minutes of meetings\n" +
                        "B. Comprehension\n" +
                        "C. Essay writing\n" +
                        "D. Formal Email writing\n" +
                        "E. Resume/ CV writing /Cover letter\n" +
                        "F. Statement of purpose",
                "Module-6: \n Oral communication","( This unit involves interactive practices in language Lab. )\n" +
                        "A. Listening Comprehension\n" +
                        "B. Pronounciation, Intonation, Stress and Rythm.\n" +
                        "C. Common everyday situations: Conversations and Dialogues.\n" +
                        "D. Communication at workplace.\n" +
                        "E. Interviews\n" +
                        "F. Formal presentations\n" +
                        "G. Acquanting students with IPA symbols\n" +
                        "H. Phonetics(Basic)\n" +
                        "I. Sounds- Vowels, Consonants\n" +
                        "J. Clearingmother tongue influence\n" +
                        "K. Clearing redundancies and common errors related to indianism.\n" +
                        "L. Group discussion M.Expressing opinions\n" +
                        "M. Coherence and Fluency in speech.",
                "Module-7: \n Reading skills","A. Reading comprehension\n" +
                        "B. Paragraph reading based on phonetic sounds / Innotation\n" +
                        "PROFESSIONAL SKILLS\n" +
                        "A. Team Building\n" +
                        "B. Soft skill and entiquettes\n" +
                        "ACQUANTANCE WITH TECHNOLOGY-AIDED LANGUAGE LEARNING\n" +
                        "A. Use of computer softwares ( Grammarly Ginger.........)\n" +
                        "B. Use of smartphone applications ( Duolingo, Bussu......)",
                "Module-8: \n Activities","A. Narrative chain\n" +
                        "B. Describing / Narrating\n" +
                        "C. Writing essay in relay\n" +
                        "D. Peer / Group activities\n" +
                        "E. Brain storming vocabulary\n" +
                        "F. Debates");

        List<Semester> firstSemesters = new ArrayList<>();
        firstSemesters.add(new Semester("Chemistry", Chemistry));
        firstSemesters.add(new Semester("MATHEMATICS-1 (Calculus and Linear Algebra)", MathFirst));
        firstSemesters.add(new Semester("PROGRAMMING FOR PROBLEM SOLVING(PPS)", Pps));
        firstSemesters.add(new Semester("WORKSHOP MANUFACTURING PRACTICE(WMP)", Workshop));
        firstSemesters.add(new Semester("ENGLISH", English));

        branches.add(new Branch("Semester 1", firstSemesters));
        //Semester first is completed


        //2 Semester
        List<String> BEE = Arrays.asList("Module-1: \n DC Circuits ( 8 Lectures )", "Electrical Circuit elements (R, L and C), Voltage and Current sources, Kirchhoff current and voltage Laws, Analysis of simple circuits with DC excitation. Star-Delta conversion, Network theorems (Superposition, Thevenin, Norton and Maximum power transfer theorems). Time-domain analysis of first order RL and RC circuits",
                "Module-2: \n AC Circuits ( 8 Lectures )","Representation of sinusoidal waveforms, Peak, rms and Average values (Form factor and Peak factor), Impedance of series and parallel circuit, Phasor representation, Real Power, Reactive Power, Apparent Power, Power Factor, Power Triangle. Analysis of single-phase Ac circuits consisting of R, L, C, RL, RC, RLC Combinations (Series and Parallel), Resonance. Three-Phase Balanced Circuits, Voltage and current relations in Star and Delta connections" ,
                        "Module-3: \n Magnetic Circuits ( 4 Lectures )","Introduction, Series and Parallel Magnetic circuits, Analysis of Series and Parallel magnetic circuits." ,
                        "Module-4: \n Transformers ( 6 Lectures )","Magnetic Materials, B-H characteristics, Ideal and Practical Transformer, EMF equation, Equivalent Circuit, Losses in transformers, Regulation and efficiency. Auto-transformer and Three-Phase Transformer connections." ,
                        "Module-5: \n Electrical Machines (10 Lectures )","Construction, Working, Torque-Speed characteristic and speed control of separately excited DC Motor. Generation of rotating Magnetic Fields, Construction and working of a ThreePhase induction Motor, Significance of Torque-Slip characteristic. Loss components and efficiency, Starting and speed control of induction Motor. Construction and working of synchronous Generators." ,
                        "Module-6: \n Electrical Installations ( 6 Lectures )","Components of L-t Switchgear: Switch Fuse Unit (SFU), MCB, ELCB, MCCB, Types of wires and cables, Earthing. Types of Batteries, Important characteristics for Batteries. Elementary calculations for energy consumption, Power factor improvement and Battery backup." ,
                        "BOOKS :\n Suggested books","1. D. P. KOTHARI AND I. J. NAGRATH, “BASIC ELECTRICAL ENGINEERING”, TATA MCGRAW HILL, 2010.\n" +
                        "2. D. C. KULSHRESHTHA, “BASIC ELECTRICAL ENGINEERING”, MCGRAW HILL, 2009.\n" +
                        "3. L. S. BOBROW, “FUNDAMENTALS OF ELECTRICAL ENGINEERING”, OXFORD UNIVERSITY PRESS, 2011.\n" +
                        "4. BASIC ELECTRICAL ENGINEERING BY FITZERALD");


        List<String> MatheSecond = Arrays.asList("Module-1 :\n Basic Probability ( 12 Lectures )", "Probability Spaces, Conditional probability, Independence; Discrete Random Variables, Independent Random variables, The multinomial Distribution, Poisson approximation to the Binomial Distribution, Infinite Sequences of Bernoulli Trials, Sums of independent Random Rariables; Expectation of discrete random variables, Moments, Variance of a sum, Correlation Coefficient, Chebyshev's Inequality." ,
                "Module-2 :\n Continuous Probability Distributions ( 4 Lectures )","Continuous Random Variables and their properties, Distribution functions and densities, Normal, Exponential and Gamma Densities" ,
                        "Module-3 : \n Bivariate Distributions ( 4 Lectures )","Bivariates distribution and their properties, Distribution of sums and quotients, Conditional densitiess, Bayes rule." ,
                        "Module-4 : \n Basic Statics (8 lectures )","Measures of central tendency: Moments, Skewness and Kurtosis, Probability Distribution: Binomial, poisson and Normal- Evaluation of statical parameters for these three distributions, Correlation and Regression-Rank Correlaton" ,
                        "Module-5 : \n Applied Statics ( 8 Lectures )","Curve fitting by the method of least squares- Fitting of straight lines, Second degree Parabolas and more General Curves. Test of significance: Large sample test for single proportion,Difference of proportions, Single Mean, Difference of Means and difference of Standard Deviations (SD)." ,
                        "Module-6 : \n Small Samples ( 4 Lectures )","Test for single Mean, Difference of Means and Correlation Coeffiecients, Test for ratio and Variance- CHI-Square Test for Goodness of fit and independence of Attributes.");


        List<String> EGD = Arrays.asList("Module-1 : \n Introduction to Engineering Drawing", "Principles of Engineering Graphics and their significance, Usage of Drawing Instruments, Lettering, Conic sections including the rectangular Hyperbola (General method only); Cycloid, Epicycloid, Hypocycloid and Involute; Scales – Plain, Diagonal and Vernier Scales." ,
                "Module-2 : \n Orthographic projections","principles of orthographic projections- Conventions-Projections of points and Lines inclined to both Planes, projections of planes inclined planes Auxiliary Planes." ,
                        "Module-3 : \n Projections of Regular Solids","Those inclined to both the Planes-Auxiliary views, Draw simple Annotation, Dimensioning and scale floor plains that include: Windows, Doors and Fixtures such as WC, Bath, Sink, Shower, etc." ,
                        "Module-4 : \n Sections and Sectional views of Right Angular Solids","Covering, Prism, Cylinder, Pyramid, Cone – Auxiliary views; Development of surfaces of Right Regular Solids- Prism, Pyramid, cylinder and Cone; Draw the sectional Orthographic views of Geometrical Solids, Objects from industry and Dwellings ( Foundation to Slab only )" ,
                        "Module-5 : \n Isometric Projections", "Principles of Isometric projection – Isometric Scale, Isometric views, Conventions; Isometric views of Lines, Planes, Simple and compound solids; Conversion of isometric views to Orthographic views and vice-versa, Conventions" ,
                        "Module-6 : \n Overview of Computer Graphics","Listing the computer Technologies that impact on Graphical Communication, Demonstrating knowledge of the theory of CAD Software [ such as: The Menu system, Toolbars ( Standard, Object properties, Draw, Modify and Dimension), Drawing Area ( Background, Crosshairs, Coordinate system ), dialog boxes and windows, Shortcut menus (Button bars), The command line (where applicable ), The status bar, Different methods of zoom as used in CAD, Select and erase objects. Isometric views of Lines, Planes, Simple and Compound Solids ]" ,
                        "Module-7 : \n Customisation and CAD Drawing","Consisting of set up of the drawing page and the printer, Including scale settings, Setting up of units and Drawing Limits; ISO and ANSI Standards for coordinate Dimensioning and Tolerancing; Orthographic constraints, Snap to objects manually and automatically; Producing drawings by using various coordinate input entry methods to draw straight lines, Applying various ways of Drawing Circles." ,
                        "Module-8 : \n Annotaions, Layering and Other Functions","Covering applying Dimensions to objects, Applying annotations to drawings; Setting up and use of layers, Layers to create drawings, Create, Edit and use customized layers; Changing line lengths through modifying existing lines ( extend/lengthen ); Printing documents to paper using the print command; Orthographic projection techniques; Drawing sectional views of composite right regular geometric solids and project the true shape of the sectioned surface; Drawing annotation, Computer-Aided Design ( CAD ) software modeling of parts and assemblies. Parametric and Non-Parametric solid, Surface, and Wireframe models. Part editing and Two-Dimensional documentation of models. Planar projection theory, Including sketching of perspective, Isometric, Multiview, Auxiliary and section views. Spatial visualization exercises. Dimensioning guidelines, Tolerancing techniques; Dimensioning and scale multi views of Dwelling." ,
                        "Module-9 : \n Demonstration of a sample Team Design project that Illustrates","Geometry and Topology of Engineered Components: Creation of Engineering models and their presentation in standard 2-D Blueprint form and as 3-D wireframe and shaded solids; Meshed Topologies for Engineering Analysis and Toolpath Generation for Component Manufacture; Geometric Dimensioning and Tolerancing; Use of solid-modeling software for creating associative models at the component and assembly levels. Floor plans that include: Windows, Doors, and Fixtures such as WC, Bath, Sink, Shower, etc. Applying colour coding according to building drawing practice; Drawing sectional elevation showing foundation to ceiling; Introduction to Building Information Modelling ( BIM )." ,
                        "BOOKS : ","1.BHATT N.D., PANCHAL V.M. & INGLE P.R., (2014), ENGINEERING DRAWING, CHAROTAR PUBLISHING HOUSE\n" +
                        "2. SHAH, M.B. &RANA B.C. (2008), ENGINEERING DRAWING AND COMPUTER GRAPHICS, PEARSON EDUCATION\n" +
                        "3. AGRAWAL B. & AGRAWAL C. M. (2012), ENGINEERING GRAPHICS, TMH PUBLICATION\n" +
                        "4. NARAYANA, K.L. & P KANNAIAH (2008), TEXT BOOK ON ENGINEERING DRAWING, SCITECHPUBLISHERS");


        List<String> SemiPHY = Arrays.asList("Module-1 : \n Review of Semiconductor Physics ( 10 Lectures )", "E-K Diagram, Density of states, Occupation probability, Fermi level and Quasi-Fermi level ( variation by carrier concentration and temperature ), P-N Junction, Metal-Semiconductor Junction ( Ohmic and Schottky ), Carrier transport, Generation, and Recombination, Semiconductor materials of interest for Optoelectronic Devices, Bandgap modification, Heterostructures, Light- Semiconductor interaction: Rates of optical transitions, Joint density of states, Condition for optical Amplification." ,
                "Module-2 : \n Semiconductor Light Emitting Diodes ( LEDs ) ( 6 Lectures )","Rate equations for carrier density, Radiative and Non-Radiative recombination mechanisms in Semiconductors, LED: Device structure, Materials, Characteristics and Figures of Merit." ,
                        "Module-3 : \n Semiconductor LASERS ( 8 Lectures )","Review of Laser Physics; Rate equations for carrier- and Photon-Density and their Steady state solutions, Laser Dynamics, Relaxation oscillations, Input-Output characteristics of Lasers. Semiconductor Laser: Structure, Materials, Device characteristics and figures of Merit; DFB, DBR, and verticalcavity Surface-Emitting Lasers (vecsel), Tunable Semiconductor Lasers." ,
                        "Module-4 : \n PHOTODETECTORS ( 6 Lectures )","Types of Semiconductor Photodetectors P-N Junction, PIN and Availanche and Their structure, Materials, Working principle and characteristics, Noise Limits on Performance, Solar cells." ,
                        "Module-5 : \n Low-Dimensional Optoelectronic Devices ( 6 Lectures )","Quantum-Well, wire and DOT Based LEDs, LASER, and PHOTODECTORS. ");

        List<Semester> secondSemesters = new ArrayList<>();
        secondSemesters.add(new Semester("Basic Electrical Engineering", BEE));
        secondSemesters.add(new Semester("Mathematics-II ( Paobability and statics)", MatheSecond));
        secondSemesters.add(new Semester("Engineering Graphics and Design", EGD));
        secondSemesters.add(new Semester("Physics ( Semiconductor Physics )", SemiPHY));

        branches.add(new Branch("Semester 2", secondSemesters));
        //second semester completed.........



        //3 Semester...........
        List<String> AEC = Arrays.asList("Module-1 : \n Diode Circuits ( 4 Lectures )", "P-N junction diode, I-V characteristics of a diode; review of half-wave and full-wave rectifiers, Zener diodes, clamping and clipping circuits." ,
                "Module-2 : \n BJT Circuits ( 8 Lectures )","Structure and I-V characteristics of a BJT, BJT as a switch. BJT as an amplifier: smallsignal model, biasing circuits, current mirror; common-emitter, common-base and common-collector amplifiers, Small signal equivalent circuits, high-frequency equivalent circuits." ,
                        "Module-3 : \n MOSFET Circuits ( 8 Hrs )","MOSFET structure and I-V characteristics. MOSFET as a switch. MOSFET as an amplifier: small-signal model and biasing circuits, common-source, common-gate and common-drain amplifiers; small signal equivalent circuits - gain, input and output impedances, trans-conductance, high frequency equivalent circuit." ,
                        "Module-4 : \n Differential, Multi stage and operational amplifiers ( 8 Hrs )","Differential, multi-stage and operational amplifiers: Differential amplifier; power amplifier; direct coupled multi-stage amplifier; internal structure of an operational amplifier, ideal op-amp, nonidealities in an op-amp (Output offset voltage, input bias current, input offset current, slew rate, gain bandwidth product)" ,
                        "Module-5 : \n Linear Application of OP-amp ( 8 Hrs )","Linear applications of op-amp: Idealized analysis of op-amp circuits. Inverting and non-inverting amplifier, differential amplifier, instrumentation amplifier, integrator, active filter, P, PI and PID controllers and lead/lag compensator using an op-amp, voltage regulator, oscillators (Wein bridge and phase shift). Analog to Digital Conversion." ,
                        "Module-6 : \n Nn-Linear Application of OP-amp ( 4 Hrs )","Nonlinear applications of op-amp: Hysteretic Comparator, Zero Crossing Detector, Square-wave and triangular-wave generators. Precision rectifier, peak detector, Monoshot." ,
                        "BOOKS : \n Suggested books","1.P.R. Gray, R.G. Meyer and S. Lewis, “Analysis and Design of Analog Integrated Circuits”, John Wiley & Sons, 2001.\n" +
                        "2. J. Millman and A. Grabel, “Microelectronics”, McGraw Hill Education, 1988.\n" +
                        "3. A S Sedra and K. C. Smith, “Microelectronic Circuits”, New York, Oxford University Press, 1998.\n" +
                        "4. J. V. Wait, L. P. Huelsman and G. A. Korn, “Introduction to Operational Amplifier theory and applications”, McGraw Hill U. S., 1992.");



        List<String> DSA = Arrays.asList("Module-1 : \n Introduction to Basic Terminology ( 4 Hrs )", "Introduction: Basic Terminologies: Elementary Data Organizations, Data Structure Operations: insertion, deletion, traversal etc.; Analysis of an Algorithm, Asymptotic Notations, Time-Space trade off." ,
                "Module-2 : \n Stack and Queue ( 10 Hrs )","Stacks and Queues: ADT Stack and its operations: Algorithms and their complexity analysis, Applications of Stacks: Expression Conversion and evaluation – corresponding algorithms and complexity analysis. ADT queue, Types of Queue: Simple Queue, Circular Queue, Priority Queue; Operations on each Type of Queues: Algorithms and their analysis." ,
                        "Module-3 : \n Linked List ( 6 Hrs )","Linked Lists: Singly linked lists: Representation in memory, Algorithms of several operations: Traversing, Searching, Insertion into, Deletion from linked list; Linked representation of Stack and Queue, Header nodes, doubly linked list: operations on it and algorithmic analysis; Circular Linked Lists: all operations their algorithms and the complexity analysis." ,
                        "Module-4 : \n Searching, Sorting and Hashing ( 12 Hrs )","Searching, Sorting and Hashing: Linear Search and Binary Search Techniques and their complexity analysis. Objective and properties of different sorting algorithms: Selection Sort, Bubble Sort, Insertion Sort, Quick Sort, Merge Sort, Heap Sort; Performance and Comparison among all the methods, Hashing." ,
                        "Module-5 : \n Trees and Graphs ( 8 Hrs )","Basic Tree Terminologies, Different types of Trees: Binary Tree, Threaded Binary Tree, Binary Search Tree, AVL Tree; Tree operations on each of the trees and their algorithms with complexity analysis. Applications of Binary Trees. B Tree, B+ Tree: definitions, algorithms and analysis.\n" +
                        "Graph: Basic Terminologies and Representations, Graph search and traversal algorithms and complexity analysis.",
                "LAB : \n Able to Practice","1.For a given Search problem (Linear Search and Binary Search) student will able to implement it.\n" +
                        "2. For a given algorithm student will able to analyze the algorithms to determine the time and computation complexity and justify the correctness.\n" +
                        "3. For a given problem of Stacks, Queues and linked list student will able to implement it and analyze the same to determine the time and computation complexity.\n" +
                        "4. Student will able to write an algorithm Selection Sort, Bubble Sort, Insertion Sort, Quick Sort, Merge Sort, Heap Sort and compare their performance in term of Space and Time complexity.\n" +
                        "5. Student will able to implement Graph search and traversal algorithms and determine the time and computation complexity.");


        List<String> OOPS = Arrays.asList("Module-1 : \n Introduction to C++ ( 3 Hrs )", "Introduction to C++ : Object Oriented Technology, Advantages of OOP, Input- output in C++, Tokens, Keywords, Identifiers, Data Types C++, Derives data types. The void data type, Type Modifiers, Typecasting, Constant, Operator, Precedence of Operators, Strings." ,
                "Module-2 : \n Control Structures and Functions","Control Structures and Functions: Decision making statements like if-else, Nested if-else, goto, break, continue, switch case, Loop statement like for loop, nested for loop, while loop, do-while loop. Parts of Function, User- defined Functions, Value- Returning Functions, void Functions, Value Parameters, Function overloading, Virtual Functions." ,
                        "Module-3 : \n Classes and Data Abstraction","Structure in C++, Class, Build- in Operations on Classes, Assignment Operator and Classes, Class Scope, Reference parameters and Class Objects (Variables), Member functions, Accessor and Mutator Functions, Constructors, default Constructor, Destructors." ,
                        "Module-4 : \n Overloading, Templates and Inheritance ( 8 Hrs )","Operator Overloading, Function Overloading, Function Templates, Class Templates. Single and Multiple Inheritance, virtual Base class, Abstract Class, Pointer and Inheritance, Overloading Member Function." ,
                        "Module-5 : \n Pointers, Arrays and Exception Handling ( 11 Hrs )","Pointers, Arrays and Exception Handling: Void Pointers, Pointer to Class, Pointer to Object, Void Pointer, Arrays. The keywords try, throw and catch. Creating own Exception Classes, Exception Handling Techniques (Terminate the Program, Fix the Error and Continue, Log the Error and Continue), Stack Unwinding.");


        List<String> MathThird = Arrays.asList("Module-1 : ", "Successive Differentiation, Leibnitz’s Theorem. Limit, Continuity and Differentiability of function for one variable." ,
                "Module-2 : \n Limit, Continuity and Differentiability ( 8 Hrs )","Limit, Continuity and Differentiability of function for several variables. Partial Derivatives, Euler’s Theorem for Homogeneous functions, Total derivatives, Change of Variables. Maxima and Minima of Several Variables. Methods of Lagrange Multipliers. Taylor’s and Maclaurin’s Theorem with remainders of several variables." ,
                        "Module-3 \n Vector Calculus ( 8 Hrs )","Vector Calculus: Gradient, Divergence and Curl of a Vector and their Physical Interpretations, Vector Identities. Directional Derivatives. Line, Surface and Volume integrals, Application of Green’s, Stokes and Gauss Divergence Theorem (Without Proof)." ,
                        "Module-4 : \n First Order Ordinary Differential Equations ( 6 Hrs )","Exact, Linear and Bernoulli’s Equations, Euler’s Equations, Equations not of First Degree: Equations Solvable for P, Equations Solvable for Y, Equations Solvable for X and Clairaut’s Type." ,
                        "Module-5 : \n Ordinary Differential Equations od Higher Orders ( 8 Hrs )","Ordinary Differential Equations of Higher Orders: Second Order Linear Differential Equations with Variable Coefficients, Method of Variation of Parameters, Cauchy-Euler Equation; Power Series Solutions; Legendre Polynomials, Bessel Functions of the First Kind and their properties." ,
                        "Module-6 : \n Partial Differential Equations ( 6 Hrs )","Partial Differential Equations – First Order: First Order Partial Differential Equations, Solutions of First Order Linear and Non-Linear PDEs.");


        List<String> TWriting = Arrays.asList("Module-1 : \n Introduction ( 10 Hrs )", "Introduction: Fundamentals of Technical Writing: Need for Clear and Concise Technical Writing, Attributes of Technical Writing, Types of Technical Writing, Benefits of Technical Writing, Technical, Managerial and General Readers, Expressing versus Impressing, Correct use of Noun, Pronoun, Verb, Adjective, Adverbs, Tense and Punctuation." ,
                "Module-2 : \n Performing Technical Studies ( 10 Hrs )","Performing Technical Studies: Types of Technical Studies, General Methodology- Proposing a Project, Gathering Background Information, Designing Test Plans, Performing Experiments, Reporting Results.\n" +
                        "Writing Strategy: Analysis of Readers, Scope of Writing, Purpose and Objective.\n" +
                        "Document Options: Document Hierarchy, Report Types and Selection.\n" +
                        "Criteria for Good Technical Writing: Technical Content, Presentation, Language Skills.\n" +
                        "Writing Style: Elements of Style, Examples of Writing Styles, Recommended Style, Learn to Prepare Effective Illustrations",
                "Module-3 \n Formal Reports ( 10 Lectures )","The Outline and Introduction ( Outline, Title, Front Matter, Writing the Introduction ), Writing the Body ( Writing a Procedure, Describing Machines/Processes, Writing Test Results, Writing the Discussion Section ), Closure ( Conclusions, Recommendations, References, Abstract, Back Matter, Report Distribution, Saving Reports ).\n" +
                        "Informal Reports: Elements of an Informal Report, Investigation Reports, Service Work, Action Letters and Proposals. Typical Memo Reports.",
                "Module-4 : \n Review and Editing ( 10 Hrs )","Review and Editing: Types of Review and Edit, Review and Editing Methodology, Examples of Reviews.\n" +
                        "Oral Presentations: Types of Oral Presentations, Preparation, Visual Aids, Impediments to Technical Writing, Maintaining Writing Skills, Measuring Report Results.",
                "BOOKS : ","A.A Guide to Technical Writing”, T. A. Rickard, Franklin Classics.                                  \n" +
                        "B. Technical Writing”, S. Jayprakash, Himalaya Publishing House Pvt. Ltd.\n" +
                        "C. Technical Writing”, O. N. Pandey.");

        List<Semester> thirdSemesters = new ArrayList<>();
        thirdSemesters.add(new Semester("Analog Electronic Circuits", AEC));
        thirdSemesters.add(new Semester("Data Structure and Algorithms", DSA));
        thirdSemesters.add(new Semester("Object Oriented programming Using C++", OOPS));
        thirdSemesters.add(new Semester("Mathematics-III ( Differential Calculus )", MathThird));
        thirdSemesters.add(new Semester("Technical Writing", TWriting));

        branches.add(new Branch("Semester 3", thirdSemesters));
        //third semester end....

        //4 Semester start...
        List<String> DiscreteMath = Arrays.asList("Module-1 : \n Set, Relation and Funtion ( 6 Hrs )", "Sets, Relation and Function: Operations and Laws of Sets, Cartesian Products, Binary Relation, Partial Ordering Relation, Equivalence Relation, Image of a Set, Sum and Product of Functions, Bijective functions, Inverse and Composite Function, Size of a Set, Finite and infinite Sets, Countable and uncountable Sets, Cantor's diagonal argument and The Power Set theorem, Schroeder-Bernstein theorem." ,
                "Module-2 : \n Principal of Mathematical Induction ( 8 Hrs )","Principles of Mathematical Induction: The Well-Ordering Principle, Recursive definition, The Division algorithm: Prime Numbers, The Greatest Common Divisor: Euclidean Algorithm, The Fundamental Theorem of Arithmetic. Basic counting techniques-inclusion and exclusion, pigeon-hole principle, permutation and combination." ,
                        "Module-3 : \n Propositional Logics ( 8 Hrs )","Propositional Logic: Syntax, Semantics, Validity and Satisfiability, Basic Connectives and Truth Tables, Logical Equivalence: The Laws of Logic, Logical Implication, Rules of Inference, The use of Quantifiers. Proof Techniques: Some Terminology, Proof Methods and Strategies, Forward Proof, Proof by Contradiction, Proof by Contraposition, Proof of Necessity and Sufficiency." ,
                        "Module-4 : \n Algebraic Structures and Morphism ( 8 hrs )","Algebraic Structures and Morphism: Algebraic Structures with one Binary Operation, Semi Groups, Monoids, Groups, Congruence Relation and Quotient Structures, Free and Cyclic Monoids and Groups, Permutation Groups, Substructures, Normal Subgroups, Algebraic Structures with two Binary Operation, Rings, Integral Domain and Fields. Boolean Algebra and Boolean Ring, Identities of Boolean Algebra, Duality, Representation of Boolean Function, Disjunctive and Conjunctive Normal Form" ,
                        "Module-5 : \n Graph and Trees ( 10 Lectures )","Graphs and their properties, Degree, Connectivity, Path, Cycle, Sub Graph, Isomorphism, Eulerian and Hamiltonian Walks, Graph Coloring, Coloring maps and Planar Graphs, Coloring Vertices, Coloring Edges, List Coloring, Perfect Graph, definition properties and Example, rooted trees, trees and sorting, weighted trees and prefix codes, Biconnected component and Articulation Points, Shortest distances." ,
                        "BOOKS : \n Suggested books","1. Kenneth H. Rosen, Discrete Mathematics and its Applications, Tata McGraw –Hill\n" +
                        "2. Discrete Mathematics, Tata McGraw -Hill\n" +
                        "3. C L Liu and D P Mohapatra, Elements of Discrete Mathematics A Computer Oriented Approach, 3rd Edition by, Tata McGraw –Hill.\n" +
                        "4. Susanna S. Epp, Discrete Mathematics with Applications, 4th edition, Wadsworth Publishing Co.Inc.");


        List<String> COA = Arrays.asList("Module-1 : \n Functional Blocks of a Computer ( 10 hrs )", "Functional blocks of a computer: CPU, memory, input-output subsystems, control unit. Instruction set architecture of a CPU–registers, instruction execution cycle, RTL interpretation of instructions, addressing modes, instruction set. Case study – instruction sets of some common CPUs.\n" +
                "Data representation: signed number representation, fixed and floating point representations, character representation. Computer arithmetic – integer addition and subtraction, ripple carry adder, carry look-ahead adder, etc. multiplication – shift-and-add, Booth multiplier, carry save multiplier, etc. Division restoring and non-restoring techniques, floating point arithmetic.",
                "Module-2 : \n Introduction to x86 architecture ( 14 hrs )","Introduction to x86 architecture. CPU control unit design: hardwired and micro- programmed design approaches, Case study – design of a simple hypothetical CPU. Memory system design: semiconductor memory technologies, memory organization.\n" +
                        "Peripheral devices and their characteristics: Input-output subsystems, I/O device interface, I/O transfers–program controlled, interrupt driven and DMA, privileged and non-privileged instructions, software interrupts and exceptions. Programs and processes–role of interrupts in process state transitions, I/O device interfaces – SCII, USB.",
                "Module-3 : \n Pipelining ( 10 Hrs )","Basic concepts of pipelining, throughput and speedup, pipeline hazards.\n" +
                        "Parallel Processors: Introduction to parallel processors, Concurrent access to memory and cache coherency.",
                "Module-4 : \n Memory organisation ( 6 Hrs )","Memory organization: Memory interleaving, concept of hierarchical memory organization, cache memory, cache size vs. Block size, mapping functions, replacement algorithms, write policies.",
                "BOOKS : \n Suggested Books","1. Computer Organization and Design: The Hardware/Software Interface”, 5th Edition by David A. Patterson and John L. Hennessy, Elsevier.\n" +
                        "2. Computer Organization and Embedded Systems”, 6th Edition by Carl Hamacher, McGraw Hill Higher Education.\n" +
                        "3. Computer System Design and Architecture”, 2nd Edition by Vincent P. Heuring and Harry F. Jordan, Pearson Education.");


        List<String> OS = Arrays.asList("Module-1 : \n Introduction ( 4Hrs )", "Concept of Operating Systems, Generations of Operating systems, Types of Operating Systems, OS Services, System Calls, Structure of an OS-Layered, Monolithic, Microkernel Operating Systems, Concept of Virtual Machine. Case study on UNIX and WINDOWS Operating System." ,
                "Module-2 : \n Processes ( 10 Hrs )","Definition, Process Relationship, Different states of a Process, Process State transitions, Process Control Block (PCB), Context switching.\n" +
                        "Thread: Definition, Various states, Benefits of threads, Types of threads, Concept of multithreads.\n" +
                        "Process Scheduling: Foundation and Scheduling objectives, Types of Schedulers, Scheduling criteria: CPU utilization, Throughput, Turnaround Time, Waiting Time, Response Time; Scheduling algorithms: Pre-emptive and Non pre-emptive, FCFS, SJF, RR; Multiprocessor scheduling: Real Time scheduling: RM and EDF.",
                "Module-3 : \n Inter- Process Communication ( 6 Hrs )","Critical Section, Race Conditions, Mutual Exclusion, Hardware Solution, Strict Alternation, Peterson’s Solution, The Producer - Consumer Problem, Semaphores, Event Counters, Monitors, Message Passing, Shared Memory, Classical IPC Problems: Reader’s & Writer Problem, Dinning Philosopher Problem etc.",
                "Module-4 : \n Deadlocks ( 4 Hrs )","Definition, Necessary and sufficient conditions for Deadlock, Deadlock Prevention, and Deadlock Avoidance: Banker’s algorithm, Deadlock detection and Recovery." ,
                        "Module-5 : \n Memory Management ( 9 Hrs )","Memory Management: Basic concept, Logical and Physical address map, Memory allocation: Contiguous Memory allocation – Fixed and variable partition–Internal and External fragmentation and Compaction; Paging and Segmentation: Principle of operation – Page allocation – Hardware support for paging, Protection and sharing, Advantages and Disadvantages of paging and segmentation.\n" +
                        "Virtual Memory: Basics of Virtual Memory – Hardware and control structures – Locality of reference, Page fault , Working Set , Dirty page/Dirty bit – Demand paging, Page Replacement algorithms: Optimal, First in First Out (FIFO), Second Chance (SC), Not recently used (NRU) and Least Recently used (LRU).",
                "Module-6 : \n File Management ( 9 hrs )","File Management: Concept of File, Access methods, File types, File operation, Directory structure, File System structure, Allocation methods (contiguous, linked, indexed), Free-space management (bit vector, linked list, grouping), directory implementation (linear list, hash table), efficiency and performance.\n" +
                        "Disk Management: Disk structure, Disk scheduling - FCFS, SSTF, SCAN, C-SCAN, Disk reliability, Disk formatting, Boot-block, Bad blocks I/O Hardware: I/O devices, Device controllers, Direct memory access, Principles of I/O Software: Goals of Interrupt handlers, Device drivers, Device independent I/O software, Secondary-Storage Structure.",
                "BOOKS : \n Suggested Books","1. Operating System Concepts Essentials, 9th Edition by Avi Silberschatz, Peter Galvin, Greg Gagne, Wiley Asia Student Edition.\n" +
                        "2. Operating Systems: Internals and Design Principles, 5th Edition, William Stallings, Prentice Hall of India.\n" +
                        "3. Operating Systems: Design and Implementation 3rd Edition, 3rd Edition, Andrew S. Tanenbaum\n" +
                        "4. Modern Operating Systems, 4th Edition, Andrew S. Tanenbaum.");


        List<String> DAA = Arrays.asList("Module-1 : \n Introduction ( 10 Hrs )", "Introduction: Characteristics of algorithm. Analysis of algorithm: Asymptotic analysis of complexity bounds – best, average and worst-case behavior; Performance measurements of Algorithm, Time and space trade-offs, Analysis of recursive algorithms through recurrence relations: Substitution method, Recursion tree method and Masters’ theorem.",
                "Module-2 : \n Divide and Conquer paradigm ( 10 Hrs )","Introduction to Divide and Conquer paradigm: Binary Search, Quick and Merge sorting techniques, linear time selection algorithm, Strassen’s Matrix Multiplication, Karatsuba Algorithm for fast multiplication etc. Introduction to Heap: Min and Max Heap, Build Heap, Heap Sort" ,
                        "Module-3 : \n Greedy and Dynamic programming ( 10 hrs )","Overview of Brute-Force, Greedy Programming, Dynamic Programming, Branch- andBound and Backtracking methodologies. Greedy paradigm examples of exact optimization solution: Minimum Cost Spanning Tree, Knapsack problem, Job Sequencing Problem, Huffman Coding, Single source shortest path problem. Dynamic Programming, difference between dynamic programming and divide and conquer, Applications: Fibonacci Series, Matrix Chain Multiplication, 0-1 Knapsack Problem, Longest Common Subsequence, Travelling Salesman Problem, Rod Cutting, Bin Packing. Heuristics – characteristics and their application domains." ,
                        "Module-4 : \n Graph and Trees Algorithms ( 8 Hrs )","Representational issues in graphs, Traversal algorithms: Depth First Search (DFS) and Breadth First Search (BFS); Shortest path algorithms: Bellman-Ford algorithm, Dijkstra’s algorithm & Analysis of Dijkstra’s algorithm using heaps, Floyd-Warshall’s all pairs shortest path algorithm. Transitive closure, Topological sorting, Network Flow Algorithm, Connected Component." ,
                        "Module-5 : \n Tractable and Intractable Problems ( 5 Hrs )","Computability of Algorithms, Computability classes – P, NP, NP-complete and NP-hard. Cook’s theorem, Standard NP-complete problems and Reduction techniques. Approximation algorithms, Randomized algorithms" ,
                        "BOOKS : \n Suggested Books","1. Algorithm Design, 1st Edition, Jon Kleinberg and Éva Tardos, Pearson.\n" +
                        "2. Algorithm Design: Foundations, Analysis, and Internet Examples, Second Edition, Michael T Goodrich and Roberto Tamassia, Wiley.\n" +
                        "3. Algorithms—A Creative Approach, 3RD Edition, UdiManber, AddisonWesley, Reading, MA.");


        List<String> DElectronics = Arrays.asList("Module-1 : \n Fundamentals of Digital Systems and logic families ( 7 Hrs )", "Fundamentals of Digital Systems and logic families: Digital signals, digital circuits, AND, OR, NOT, NAND, NOR and Exclusive-OR operations, Boolean algebra, examples of IC gates, number systems-binary, signed binary, octal hexadecimal number, binary arithmetic, one’s and two’s complements arithmetic, codes, error detecting and correcting codes, characteristics of digital lCs, digital logic families, TTL, Schottky TTL and CMOS logic, interfacing CMOS and TTL, Tri - state logic." ,
                "Module-2 : \n Combinational Digital Circuits (7 Hrs )","Combinational Digital Circuits: Standard representation for logic functions K-map representation, simplification of logic functions using K-map, minimization of logical functions. Don’t care conditions, Multiplexer, DeMultiplexer/Decoders, Adders, Subtractors, BCD arithmetic, carry look ahead adder, serial adder, ALU, elementary ALU design, popular MSI chips, digital comparator, parity checker/generator, code converters, priority encoders, decoders/drivers for display devices, Q-M method of function realization.",
                "Module-3 : \n Sequential circuits and systems ( 7 Hrs )","Sequential circuits and systems: A 1-bit memory, the circuit properties of Bistable latch, the clocked SR flip flop, J- K-T and D types flip flops, applications of flip flops, shift registers, applications of shift registers, serial to parallel converter, parallel to serial converter, ring counter, sequence generator, ripple (Asynchronous) counters, synchronous counters, counters design using flip flops, special counter IC’s, asynchronous sequential counters, applications of counters." ,
                        "Module-4 : \n A/D and D/A Converters ( 7 Hrs )","Digital to analog converters: weighted resistor/converter, R-2RLadder D/A converter, specifications for D/A converters, examples of D/A converter lCs, sample and hold circuit, analog to digital converters: quantization and encoding, parallel comparator A/D converter, successive approximation A/D converter, counting A/D converter, dual slope A/D converter, A/D converter using\n" +
                        "Voltage to frequency and voltage to time conversion, specifications of A/D converters, example of A/D converter ICs.",
                "Module-5 : \n Semiconductor memories and Programmable logic devices ( 7 Hrs )","Semiconductor memories and Programmable logic devices: Memory organization and operation, expanding memory size, classification and characteristics of memories, sequential memory, read only memory (ROM), read and write memory(RAM), content addressable memory (CAM), charge de coupled device memory (CCD), commonly used memory chips, ROM as a PLD, Programmable logic array, Programmable array logic, complex Programmable logic devices (CPLDS), Field Programmable Gate Array (FPGA)." ,
                        "BOOKS : \n Suggested Books","A. R. P. Jain, Modern Digital Electronics, McGraw Hill Education, 2009.                                  \n" +
                        "B. M. M. Mano, Digital logic and Computer design, Pearson Education India, 2016.\n" +
                        "C. A. Kumar, Fundamentals of Digital Circuits, Prentice Hall India, 2016.");



        List<String> HRDOB = Arrays.asList("Module-1 : \n Introduction ( 8 Hrs )", "HR Role and Functions, Concept and Significance of HR, Changing role of HR managers - HR functions and Global Environment, role of a HR Manager. Human Resources Planning: HR Planning and Recruitment: Planning Process - planning at different levels - Job Analysis" ,
                "Module-2 : \n Recruitment and selection processes ( 8 Hrs )","Recruitment and selection processes - Restructuring strategies - Recruitment-Sources of Recruitment-Selection Process-Placement and Induction-Retention of Employees. Training and Development: need for skill upgradation - Assessment of training needs - Retraining and Redeployment methods and techniques of training employees and executives – performance appraisal systems." ,
                        "Module-3 : \n Performance Management System ( 8 Hrs )","Performance Management System: Definition, Concepts and Ethics-Different methods of Performance Appraisal- Rating Errors Competency management. Industrial Relations : Factors influencing industrial relations - State Interventions and Legal Framework - Role of Trade unions - Collective Bargaining - Workers; participation in management." ,
                        "Module-4 : \n Organizational Behaviour ( 8 Hrs )","Organizational Behaviour: Definition, Importance, Historical Background, Fundamental Concepts of OB, Challenges and Opportunities for OB. Personality and Attitudes: Meaning of personality, Personality Determinants and Traits, Development of Personality, Types of Attitudes, Job Satisfaction." ,
                        "Module-5 : \n Leadership ( 8 Hrs )","Leadership: Definition, Importance, Theories of Leadership Styles. Organizational Politics: Definition, Factors contributing to Political Behavior. Conflict Management: Traditional vis-a-vis Modern View of Conflict, Functional and Dysfunctional Conflict, Conflict Process, Negotiation - Bargaining Strategies, Negotiation Process." ,
                        "BOOKS : \n Suggested Books","1. Gary Dessler, “Human Resource Management” - (8th ed.,) Pearson Education, Delhi.\n" +
                        "2. Robbins, S. P., Judge & T. A., “Organizational Behavior”, Pearson Education, 15th Edn. Algorithms—A Creative Approach, 3RD Edition, UdiManber, AddisonWesley, Reading, MA.\n" +
                        "3. Decenzo & Robbins, Personnel Human Resource Management, 3rd ed., John Wiley & Sons (Pvt.) Ltd.");


        List<String>  EScience = Arrays.asList("Mandatory : \n Non Credit Course", "We as human being are not an entity separate from the environment around us rather we are a constituent seamlessly integrated and co-exist with the environment around us. We are not an entity so separate from the environment that we can think of mastering and controlling it rather we must understand that each and every action of ours reflects on the environment and vice versa. Ancient wisdom drawn from Vedas about environment and its sustenance reflects these ethos. There is a direct application of this wisdom even in modern times. Idea of an activity based course on environment protection is to sensitize the students on the above issues through following two type of activities:" ,
                "A. Awareness Activities:","1. Small group meetings about water management, promotion of recycle use, generation of less waste, avoiding electricity waste\n" +
                        "2. Slogan making events\n" +
                        "3. Poster making events\n" +
                        "4. Cycle rally\n" +
                        "5. Lectures from experts",
                "B. Actual activities:","1. Plantation\n" +
                        "2. Gifting a tree to see its full growth\n" +
                        "3. Cleanliness drive\n" +
                        "4. Drive for segregation of waste\n" +
                        "5. To live some big environmentalist for a week or so to understand his work\n" +
                        "6. To work in kitchen garden for mess\n" +
                        "7. To know about the different varieties of plants\n" +
                        "8. Shutting down the fans and ACs of the campus for an hour or so");


        List<Semester> fourthSemesters = new ArrayList<>();
        fourthSemesters.add(new Semester("Discrete Mathematics", DiscreteMath));
        fourthSemesters.add(new Semester("Computer Organisation and Architectures", COA));
        fourthSemesters.add(new Semester("Operating System", OS));
        fourthSemesters.add(new Semester("Design Analysis of Algorithms", DAA));
        fourthSemesters.add(new Semester("Digital Electronics", DElectronics));
        fourthSemesters.add(new Semester("Human Resource Development and Organisational Behaviour", HRDOB));
        fourthSemesters.add(new Semester("Environmental Science", EScience));

        branches.add(new Branch("Semester 4", fourthSemesters));
        //fourth semester completed......




        //5 Semester start......
        List<String> DBMS = Arrays.asList("Module-1 : \n Database system architecture and Data Model ( 6 Hrs )", "Database system architecture: Data Abstraction, Data Independence, Data Definition Language (DDL), Data Manipulation Language (DML).\n" +
                "Data models: Entity-relationship model, network model, relational and object oriented data models, integrity constraints, data manipulation operations.",
                "Module-2 : \n Relational Query Language ( 10 Hr)","Relational query languages: Relational algebra, Tuple and domain relational calculus, SQL3, DDL and DML constructs, Open source and Commercial DBMS - MYSQL, ORACLE, DB2, SQL server\n" +
                        "Relational database design: Domain and data dependency, Armstrong’s axioms, Normal forms, Dependency preservation, Lossless design.\n" +
                        "Query processing and optimization: Evaluation of relational algebra expressions, Query equivalence, Join strategies, Query optimization algorithms.",
                "Module-3 : \n Storage Strategy (4 Hr )","Storage strategies: Indices, B-trees, hashing." ,
                        "Module-4 : \n Transaction Processing( 8 hrs )","Transaction processing: Concurrency control, ACID property, Serializability of scheduling, Locking and timestamp based schedulers, Multi-version and optimistic Concurrency Control schemes, Database recovery." ,
                        "Module-5 : \n Database Security ( 6 Lectures )","Database Security: Authentication, Authorization and access control, DAC, MAC and RBAC models, Intrusion detection, SQL injection." ,
                        "Module-6 : \n Advance Topics( 4 Hrs )","Advanced topics: Object oriented and object relational databases, Logical databases, Web databases, Distributed databases, Data warehousing and data mining.",
                "BOOKS : \n Suggested books","1. “Database System Concepts”, 6th Edition by Abraham Silberschatz, Henry F. Korth, S. Sudarshan, McGraw-Hill\n" +
                        "2. \"Fundamentals of Database Systems”, 5th Edition by R. Elmasri and S. Navathe, Pearson Education\n" +
                        "3. \"Foundations of Databases”, Reprint by Serge Abiteboul, Richard Hull, Victor Vianu, Addison-Wesley\n" +
                        "4. “Principles of Database and Knowledge – Base Systems”, Vol 1 by J. D. Ullman, Computer SciencePress");


        List<String> FLAT = Arrays.asList("Module-1 : \n Introduction and Regular languages and finite automata( 10 hrs )", "Introduction: Alphabet, languages and grammars, productions and derivation, Chomsky hierarchy of languages.\n" +
                "Regular languages and finite automata: Regular expressions and languages, deterministic finite automata (DFA) and equivalence with regular expressions, nondeterministic finite automata (NFA) and equivalence with DFA, regular grammars and equivalence with finite automata, properties of regular languages, pumping lemma for regular languages, minimization of finite automata\n" +
                "Data representation: signed number representation, fixed and floating point representations, character representation. Computer arithmetic – integer addition and subtraction, ripple carry adder, carry look-ahead adder, etc. multiplication – shift-and-add, Booth multiplier, carry save multiplier, etc. Division restoring and non-restoring techniques, floating point arithmetic.",
                "Module-2 : \n Context-free languages and pushdown automat ( 10 hrs )","Context-free grammars (CFG) and Contextfree languages (CFL), Chomsky and Greibach normal forms, nondeterministic pushdown automata (PDA) and equivalence with CFG, parse trees, ambiguity in CFG, pumping lemma for context-free languages, deterministic pushdown automata, closure properties of CFLs",
                "Module-3 : \n Context Sensitive Language ( 2 Hrs )","Context-sensitive languages: Context-sensitive grammars (CSG) and Context-sensitive languages, linear bounded automata and equivalence with CSG." ,
                        "Module-4 : \n Turing Machine( 10 Hrs )","Turing machines: The basic model for Turing machines (TM), Turing recognizable (Recursively enumerable) and Turing-decidable (recursive) languages and their closure properties, variants of Turing machines, nondeterministic TMs and equivalence with deterministic TMs, unrestricted grammars and equivalence with Turing machines, TMs as enumerator.",
                "Module-5 : \n Undecidability","Church-Turing thesis, universal Turing machine, the universal and diagonalization languages, reduction between languages and Rice’s theorem, undecidable problems about languages" ,
                        "BOOKS : \n Suggested Books","1. Michael Sipser, Introduction to the Theory of Computation, PWS Publishing.\n" +
                        "2. John E. Hopcroft, Rajeev Motwani and Jeffrey D. Ullman, Introduction to Automata Theory, Languages, and Computation, Pearson Education Asia.\n" +
                        "3. Harry R. Lewis and Christos H. Papadimitriou, Elements of the Theory of Computation, Pearson EducationAsia.\n" +
                        "4. John Martin, Introduction to Languages and the Theory of Computation, Tata McGraw Hill.\n" +
                        "5. Dexter C. Kozen, Automata and Computability, Undergraduate Texts in Computer Science, Springer.");


        List<String> AI = Arrays.asList("Module-1 : \n Introduction ( 10 Hrs )", "Overview, Turing test, Intelligent agents. Problem Solving: Solving Problems by Searching: Uninformed search - Depth First Search, Breadth First Search, DFID, Heuristic search - Generate and Test, Best First Search, Beam Search, Hill Climbing, A*, Problem reduction search – AND/OR Graphs, AO*, Constraint satisfaction, Means-ends analysis, Stochastic search methods - Simulated Annealing, Particle Swarm Optimization, Game Playing - Minimax algorithm, Alpha-beta pruning." ,
                "Module-2 : \n Building Logic( 10 Hrs )","Knowledge and Reasoning: Building a knowledge base - Propositional logic, first order logic, Inference in first order logic, Resolution – refutation proofs, Theorem Proving in First Order\n" +
                        "Logic: Planning, partial order planning, Uncertain Knowledge and Reasoning, Probabilities, Bayesian Networks .",
                "Module-3 : \n Learning ( 10 Hrs )","Learning: Overview of different forms of learning: unsupervised, supervised, semi-supervised, K-means clustering algorithm, Decision Trees, Neural Networks, Deep Learning." ,
                        "Module-4 : \n Advance Topics","Advanced topics: Introduction to Computer Vision, Natural Language Processing, Expert Systems, Robotics, Genetic Algorithm." ,
                        "BOOKS : \n Suggested Books","1. S. Russell and P. Norvig, “Artificial Intelligence: A Modern Approach,” Prentice Hall\n" +
                        "2. C. Bishop,“Pattern Recognition and Machine Learning,\" Springer\n" +
                        "3. E. Rich, K. Knight and S. B. Nair, “Artificial Intelligence,” TMH\n" +
                        "4. A. C.Staugaard, Jr., “Robotics and AI: An Introduction to Applied Machine Intelligence.");


        List<String> SE = Arrays.asList("Module-1 : \n Introduction ( 8 Hrs )", "What is Software Engineering and its history, software crisis, Evolution of a Programming System Product, Characteristics of Software, Brooks’ No Silver Bullet, and Software Myths, Software Development Life Cycles: Software Development Process, The Codeand-Fix model, The Waterfall model, The Evolutionary Model, The Incremental Implementation, Prototyping, The Spiral Model, Software Reuse, Critical Comparisons of SDLC models, An Introduction to Non-Traditional Software Development Process: Rational Unified Process, Rapid Application Development, Agile Development Process." ,
                "Module-2 : \n Requirements ( 8 Hrs )","Importance of Requirement Analysis, User Needs, Software Features and Software Requirements, Classes of User Requirements: Enduring and Volatile, Sub phases of Requirement Analysis, Functional and Nonfunctional requirements, Barriers to Eliciting User requirements, The software requirements document and SRS standards, Requirements Engineering, Case Study of SRS for a Real Time System. Tools for Requirements Gathering: Document Flow Chart, Decision Table, Decision Tree, Introduction to nontraditional Requirements. Module ." ,
                        "Module-3 : \n Software Design( 6 hrs )","Goals of good software design, Design strategies and methodologies, Data oriented software design, Coupling, Cohesion, Modular structure, Packaging, Structured Analysis: DFD, Data Dictionary, Structured Design: Structure chart, Object oriented design, Topdown and bottom-up approach, UML, UML Diagrams, Design patterns." ,
                        "Module-4 : \n Software Project Management ( 6 Hrs )","Overview of Project Manager Responsibilities & project planning, Software Measurement and Metrics: Line of Code (LOC), Function Point (FP) based measures, Various Size Oriented Measures: Halstead's software science, Project Size estimation Metrics Project Estimation, Techniques, COCOMO, Staffing Level Estimation, Scheduling, Organization & Team Structures Staffing, Risk Management." ,
                        "Module-5 : \n Software Coding & Testing ( 5 Hrs )","Development: Selecting a language, Coding guidelines, Writing code, Code documentation. Testing process, Design of test cases, Functional Testing: Boundary value analysis, Equivalence class testing, Decision table testing, Cause effect graphing, Structural testing, Cyclomatic Complexity Measures: Control flow graphs, Path testing, Data flow and mutation testing, Unit testing, Integration and system testing, Debugging, Alpha & beta testing, testing tools & standards." ,
                        "Module-6 : \n Software maintenance ( 4 Hrs )","Management of maintenance, Maintenance process, Maintenance models, Regression testing, Reverse engineering, Software reengineering, Configuration management, documentation." ,
                        "Module-7 : \n Software Reliability & Quality Management (3 Hrs )","Introduction to reliability and metrics to reliability measure, Overview of S/W Quality management System ISO 9000, SEI CMM." ,
                        "BOOKS : \n Suggested Books","1. Software Engineering: A Practitioner's Approach, R. S. Pressman, McGraw Hill .\n" +
                        "2. Zero Defect Software, G. G. Schulmeyer, McGraw-Hill .\n" +
                        "3. Fundamental of Software Engg. By Rajib Mall 4th edition PHI.");


        List<String> PSD = Arrays.asList("Module-1 : \n Communicational Skill ( 10 Hrs )", "Public speaking, Group discussion, Gestures and body language & professional presentation skills." ,
                "Module-2 : \n Interpersonal Skills ( 10 Hrs )","Group dynamics, Negotiation skills, Leadership, Emotional intelligence." ,
                        "Module-3 : \n Employability and Corporate Skills ( 10 Hrs )","Time management and effective planning, Stress management, People skills, Team work, development of leadership qualities, Decision making and Negotiation skills, Positive attitude, Self-motivation, Professional ethics, Business etiquettes, balancing board room." ,
                        "Module-4 : \n Business Writing Skill( 10 Hrs )","Resume Writing. Interview Skills, Technical Presentation, Guest Lecture, Professional Ethics, Project Management, Entrepreneurship." ,
                        "BOOKS : \n Suggested Books","1. “Personality Development and Soft Skills”, Barun Mitra, Oxford University Press.                                 \n" +
                        "B. “Managing Soft Skills for Personality Development”, B.N. Ghosh, McGraw Hill.\n" +
                        "C. Communication to Win”, Richard Denny, Kogan Page India Pvt. Ltd.");


        List<String> SoftwareTraining = Arrays.asList("Software Training");


        List<String> CIBFFP  = Arrays.asList("The Constitution of India is the supreme law of India. Parliament of India cannot make any law which violates the Fundamental Rights enumerated under the Part III of the Constitution. The Parliament of India has been empowered to amend the Constitution under Article 368, however, it cannot use this power to change the “basic structure” of the constitution, which has been ruled and explained by the Supreme Court of India in its historical judgments. The Constitution of India reflects the idea of “Constitutionalism” – a modern and progressive concept historically developed by the thinkers of “liberalism” – an ideology which has been recognized as one of the most popular political ideology and result of historical struggles against arbitrary use of sovereign power by state. The historic revolutions in France, England, America and particularly European Renaissance and Reformation movement have resulted into progressive legal reforms in the form of “constitutionalism” in many countries. The Constitution of India was made by borrowing models and principles from many countries including United Kingdom and America.",
                "The Constitution of India is not only a legal document but it also reflects social, political and economic perspectives of the Indian Society. It reflects India’s legacy of “diversity”. It has been said that Indian constitution reflects ideals of its freedom movement, however, few critics have argued that it does not truly incorporate our own ancient legal heritage and cultural values. No law can be “static” and therefore the Constitution of India has also been amended more than one hundred times. These amendments reflect political, social and economic developments since the year 1950. The Indian judiciary and particularly the Supreme Court of India has played an historic role as the guardian of people. It has been protecting not only basic ideals of the Constitution but also strengthened the same through progressive interpretations of the text of the Constitution. The judicial activism of the Supreme Court of India and its historic contributions has been recognized throughout the world and it gradually made it “as one of the strongest court in the world." ,
                        "Course Contents : ","1. Parliamentary Form of Government in India – The constitution powers and status of the President of India.\n" +
                        "2. Historical perspective of the Constitution of India.\n" +
                        "4. Salient features and characteristics of the Constitution of India .\n" +
                        "5. Scheme of the fundamental rights 6. The scheme of the Fundamental Duties and its legal status.\n" +
                        "s 7. The Directive Principles of State Policy – Its importance and implementation .\n" +
                        "8. Federal structure and distribution of legislative and financial powers between the Union and the States 9. Meaning of constitutional law and “Constitutionalism”\n" +
                        "10. Amendment of the Constitutional Powers and Procedure.\n" +
                        "11. The historical perspectives of the constitutional amendments in India.\n" +
                        "12. Emergency Provisions: National Emergency, President Rule, Financial Emergency.\n" +
                        "13. Local Self Government – Constitutional Scheme in India 14. Scheme of the Fundamental Right to Equality.\n" +
                        "15. Scheme of the Fundamental Right to certain Freedom under Article 19.\n" +
                        "16. Scope of the Right to Life and Personal Liberty under Article 21.");




        List<String> MOOC = Arrays.asList("MOOCs / SWAYAM / NPTEL etc. Courses - |");


        List<String> Entrepreneurship = Arrays.asList("Summer Entrepreneurship - ||");


        List<String> Seminar = Arrays.asList("Seminar");


        List<Semester> fifthSemesters = new ArrayList<>();
        fifthSemesters.add(new Semester("Database management System", DBMS));
        fifthSemesters.add(new Semester("Formal Language & Automata Theory", FLAT));
        fifthSemesters.add(new Semester("Artificial Intelligence", AI));
        fifthSemesters.add(new Semester("Software Engineering", SE));
        fifthSemesters.add(new Semester("Professional Skill Development", PSD));
        fifthSemesters.add(new Semester("Software Training", SoftwareTraining));
        fifthSemesters.add(new Semester("Constitution of India / Essence of Indian Knowledge Traditional", CIBFFP));
        fifthSemesters.add(new Semester("MOOCs / SWAYAM / NPTEL etc. Courses-|", MOOC));
        fifthSemesters.add(new Semester("Summer Entrepreneurship-||", Entrepreneurship));
        fifthSemesters.add(new Semester("Seminar", Seminar));

        branches.add(new Branch("Semester 5", fifthSemesters));
        //5th seseter completed.....





        //6 Semester start....
        List<String> CN = Arrays.asList("Module-1 : \n Data communication Components (8 Hours)", "Representation of data and its flow Networks , Various Connection Topology, Protocols and Standards, OSI model, Transmission Media, LAN: Wired LAN, Wireless LANs, Connecting LAN and Virtual LAN, Techniques for Bandwidth utilization: Multiplexing - Frequency division, Time division and Wave division, Concepts on spread spectrum." ,
                "Module-2 : \n Data Link Layer and Medium Access Sub Layer (8 Hours)","Error Detection and Error Correction - Fundamentals, Block coding, Hamming Distance, CRC; Flow Control and Error control protocols - Stop and Wait, Go back – N ARQ, Selective Repeat ARQ, Sliding Window, Piggybacking, Random Access, Multiple access protocols - Pure ALOHA, Slotted ALOHA, CSMA/CD,CDMA/CA." ,
                        "Module-3 : \n Network Layer (8 Hours)","Switching, Logical addressing – IPV4, IPV6; Address mapping - ARP, RARP, BOOTP and DHCP–Delivery, Forwarding and Unicast Routing protocols." ,
                        "Module-4 : \n Transport Layer (8 Hours)","Process to Process Communication, User Datagram Protocol (UDP), Transmission Control Protocol (TCP), SCTP Congestion Control; Quality of Service, QoS improving techniques: Leaky Bucket and Token Bucket algorithm." ,
                        "Module-5 : \n Application Layer (8 Hours)","Domain Name Space (DNS), DDNS, TELNET, EMAIL, File Transfer Protocol (FTP), WWW, HTTP, SNMP, Bluetooth, Firewalls, Basic concepts of Cryptography." ,
                        "Books : \n Suggested Books","1. Data Communication and Networking, 4 th Edition, Behrouz A. Forouzan, Mc GrawHill.\n" +
                        "2. Data and Computer Communication, 8 th Edition, William Stallings, Pearson Prentice Hall India.\n" +
                        "1. Computer Networks, 8th Edition, Andrew S. Tanenbaum, Pearson New International Edition.\n" +
                        "2. Internetworking with TCP/IP, Volume 1, 6 th Edition Douglas Comer, Prentice Hall of India.");


        List<String> CD = Arrays.asList("Module-1 : \n Introduction ( 6 Lectures )", "Lexical Analysis (scanner): Regular languages, finite automata, regular expressions, from regular expressions to finite automata, scanner generator (lex, flex).\n" +
                "Phase of compilation and overview.",
                "Module-2 : \n Syntax Analysis (Parser) ( 9 Lectures )","Context-free languages and grammars, push-down automata, LL(1) gram-mars and top-down parsing, operator grammars, LR(O), SLR(1), LR(1), LALR(1) grammars and bottom-up parsing, ambiguity and LR parsing, LALR(1) parser generator (yacc, bison)." ,
                        "Module-3 : \n Symantic Analysis and Symbol Table ( 10 Lectures )","Attribute grammars, syntax directed definition, evaluation and flow of attribute in a syntax tree.\n" +
                        "Symbol Table: Its structure, symbol attributes and management. Run-time environment: Procedure activation, parameter passing, value return, memory allocation, and scope.",
                "Module-4 : \n Code Generation and Architecture Improvement ( 10 Lectures )","Intermediate Code Generation: Translation of different language features, different types of intermediate forms.\n" +
                        "Code Improvement (optimization) Analysis: control-flow, data-flow dependence etc.; Code improvement local optimization, global optimization, loop optimization, peep-hole optimization etc.\n" +
                        "Architecture dependent code improvement: instruction scheduling (for pipeline), loop optimization (for cache memory) etc. Register allocation and target code generation.",
                "Module-5 : \n Advanced Topics ( 5 Lectures )","Type systems, data abstraction, compilation of Object Oriented features and non-imperative programming languages." ,
                        "BOOKS : \n Suggested Books","CompilersPrinciples.Techniques. AndToolsbyAlfredV.Aho. RaviSethiJefferyD.Ullman. PearsonEducation.\n" +
                        "2. Compiler Design by Santanu Chattopadhyay. PHI\n" +
                        "3. Modern Compiler Design by Dick Grune . E. Bal. Ceriel J. H. Jacobs. And Koen G. Langendoen Viley Dreamtech.");

//ml
        List<String> ML = Arrays.asList("Module-1 : \n Introduction ( 8 Hrs )", "Basic definitions, Linear Algebra, Statistical learning theory, types of learning, hypothesis space and Inductive bias, evaluation and cross validation, Optimization." ,
                "Module-2 : ","Statistical Decision Theory, Bayesian Learning (ML, MAP, Bayes estimates, Conjugate priors), Linear Regression, Ridge Regression, Lasso, Principal Component Analysis, Partial Least Squares." ,
                        "Module-3 : ","Linear Classification, Logistic Regression, Linear Discriminant Analysis, Quadratic Discriminant Analysis, Perceptron, Support Vector Machines + Kernels, Artificial Neural Networks + Back Propagation, Decision Trees, Bayes Optimal Classifier, Naive Bayes." ,
                        "Module-4 : ","Hypothesis testing, Ensemble Methods, Bagging Adaboost Gradient Boosting, Clustering, K- means, K-medoids, Density-based Hierarchical, Spectral." ,
                        "Module-5 : ","Expectation Maximization, GMMs, Learning theory Intro to Reinforcement Learning , Bayesian Networks.");

//elective first
        List<String> ElectiveFirst = Arrays.asList("Signal and System",
                "Graph Theory",
                "Computer Graphics",
                "Introduction To Java Programming Language",
                "Probability and Statistical Inference",
                "Numerical Methods",
                "Information Theory and Coding");

//elective second
        List<String> ElectiveSecond = Arrays.asList("Soft Computing",
                "Distributed Database",
                "Advanced Data Structures and Algorithms",
                "Advance Java Programming Language",
                "Web and Internet Technology",
                "Multimedia Technology and its Applications",
                "Cryptography and Network Security",
                "Mobile and Wireless Computing");

//project first
        List<String> ProjectFirst = Arrays.asList("Project-|");

//professional elective  lab 1
        List<String> PElectiveLabFirst  = Arrays.asList("Website development using PHP ( HTML, XHTML, XML, JavaScript, CSS[Bootstrap]) laboratory.",
                "Python Programming",
                "Working on MATLAB",
                "Working on Android Studio",
                "Working with UNIX/ LINUX");
//Mooc Two
        List<String> MoocTwo = Arrays.asList("MOOCs / SWAYAM / NPTEL etc. Courses-||");


//GESSC
        List<String> GESCC = Arrays.asList("Graduate Employability Skills And Competitive Courses(GATE,IES,ETC.");


        List<Semester> sixthSemesters = new ArrayList<>();
        sixthSemesters.add(new Semester("Computer Network", CN));
        sixthSemesters.add(new Semester("Compiler Design", CD));
        sixthSemesters.add(new Semester("Machine Learning", ML));
        sixthSemesters.add(new Semester("Program Elective-|", ElectiveFirst));
        sixthSemesters.add(new Semester("Program Elective-||", ElectiveSecond));
        sixthSemesters.add(new Semester("Project-|", ProjectFirst));
        sixthSemesters.add(new Semester("Professional Elective Lab-|", PElectiveLabFirst));
        sixthSemesters.add(new Semester("MOOCs / SWAYAM / NPTEL etc. Courses-||", MoocTwo));
        sixthSemesters.add(new Semester("Graduate Employability Skills And Competitive Courses(GATE,IES,ETC.)", GESCC));


        branches.add(new Branch("Semester 6", sixthSemesters));
        //6th semester completed....



        //7 Semester start....
        List<String> BiologyForEngineers = Arrays.asList("Module-1 : Introduction Lecture : 2 hrs.", "Purpose: To convey that Biology is as important a scientific discipline as Mathematics, Physics and Chemistry. Bring out the fundamental differences between science and engineering by drawing a comparison between eye and camera, Bird flying and aircraft. Mention the most exciting aspect of biology as an independent scientific discipline. Why we need to study biology? Discuss how biological observations of 18th Century that lead to major discoveries. Examples from Brownian motion and the origin of thermodynamics by referring to the original observation of Robert Brown and Julius Mayor. These examples will highlight the fundamental importance of observations in any scientific inquiry.",
                "Module 2: Classification Lecture: 3 hrs.", "Purpose: To convey that classification per se is not what biology is all about. The underlying criterion, such as morphological, biochemical or ecological be highlighted. Hierarchy of life forms at phenomenological level. A common thread weaves this hierarchy Classification. Discuss classification based on (a) cellularity- Unicellular or multicellular (b) ultrastructure- prokaryotes or eucaryotes. (c) energy and Carbon utilisation -Autotrophs, heterotrophs, lithotropes (d) Ammonia excretion – aminotelic, uricoteliec, ureotelic (e) Habitata- acquatic or terrestrial (f) Molecular taxonomy- three major kingdoms of life. A given organism can come under different category based on classification. Model organisms for the study of biology come from different groups. E.coli, S.cerevisiae, D. Melanogaster, C. elegance, A. Thaliana, M. musculus.",
                "Module 3: Genetics Lecture: 4 hrs.", "Purpose: To convey that “Genetics is to biology what Newton’s laws are to Physical Sciences” Mendel’s laws, Concept of segregation and independent assortment. Concept of allele. Gene mapping, Gene interaction, Epistasis. Meiosis and Mitosis be taught as a part of genetics. Emphasis to be give not to the mechanics of cell division nor the phases but how genetic material passes from parent to offspring. Concepts of recessiveness and dominance. Concept of mapping of phenotype to genes. Discuss about the single gene disorders in humans. Discuss the concept of complementation using human genetics.",
                "Module 4: Biomolecules Lecture: 4 hrs.", "Purpose: To convey that all forms of life has the same building blocks and yet the manifestations are as diverse as one can imagine. Molecules of life. In this context discuss monomeric units and polymeric structures. Discuss about sugars, starch and cellulose. Amino acids and proteins. Nucleotides and DNA/RNA. Two carbon units and lipids.",
                "Module 5: Enzymes Lecture: 4 hrs.", "Purpose: To convey that without catalysis life would not have existed on earth Enzymology: How to monitor enzyme catalysed reactions. How does an enzyme catalyse reactions? Enzyme classification. Mechanism of enzyme action. Discuss at least two examples. Enzyme kinetics and kinetic parameters. Why should we know these parameters to understand biology? RNA catalysis",
                "Module 6: Information Transfer Lecture: 4 hrs." ,"Purpose: The molecular basis of coding and decoding genetic information is universal Molecular basis of information transfer. DNA as a genetic material. Hierarchy of DNA structure- from single stranded to double helix to nucleosomes. Concept of genetic code. Universality and degeneracy of genetic code. Define gene in terms of complementation and recombination.",
                "Module 7: Macromolecular analysis Lecture: 5 hrs.", "Purpose: How to analyse biological processes at the reductionist level Proteins- structure and function. Hierarch in protein structure. Primary secondary, tertiary and quaternary structure. Proteins as enzymes, transporters, receptors and structural elements.",
                "Module 8: Metabolism Lecture: 4 hrs." ,"Purpose: The fundamental principles of energy transactions are the same in physical and biological world. Thermodynamics as applied to biological systems. Exothermic and endothermic versus endergonic and exergoinc reactions. Concept of Keqand its relation to standard free energy. Spontaneity. ATP as an energy currency. This should include the breakdown of glucose to CO2 + H2O (Glycolysis and Krebs cycle) and synthesis of glucose from CO2 and H2O (Photosynthesis). Energy yielding and energy consuming reactions. Concept of Energy charge.",
                "Module 9: Microbiology Lecture: 3 hrs.", "Purpose: Concept of single celled organisms. Concept of species and strains. Identification and classification of microorganisms. Microscopy. Ecological aspects of single celled organisms. Sterilization and media compositions. Growth kinetics.",
                "Suggested Reference Books:\n" +
                        "1. Biology: A global approach: Campbell, N. A.; Reece, J. B.; Urry, Lisa; Cain, M, L.;\n" +
                        "Wasserman, S. A.; Minorsky, P. V.; Jackson, R. B. Pearson Education Ltd\n" +
                        "2. Outlines of Biochemistry, Conn, E.E; Stumpf, P.K; Bruening, G; Doi, R.H. John Wiley\n" +
                        "and Sons\n" +
                        "3. Principles of Biochemistry (V Edition), By Nelson, D. L.; and Cox, M. M.W.H.\n" +
                        "Freeman and Company\n" +
                        "4. Molecular Genetics (Second edition), Stent, G. S.; and Calender, R. W.H. Freeman and\n" +
                        "company, Distributed by Satish Kumar Jain for CBS Publisher\n" +
                        "5. Microbiology, Prescott, L.M J.P. Harley and C.A. Klein 1995. 2nd edition Wm, C.\n" +
                        "Brown Publishers",
                "Course Outcomes\n" +
                        "After studying the course, the student will be able to:\n" +
                        "1. Describe how biological observations of 18th Century that lead to major discoveries.\n" +
                        "2. Convey that classification per seis not what biology is all about but highlight the\n" +
                        "underlying criteria, such as morphological, biochemical and ecological\n" +
                        "3. Highlight the concepts of recessiveness and dominance during the passage of genetic\n" +
                        "material from parent to offspring\n" +
                        "4. Convey that all forms of life have the same building blocks and yet the manifestations\n" +
                        "are as diverse as one can imagine\n" +
                        "5. Classify enzymes and distinguish between different mechanisms of enzyme action.\n" +
                        "6. Identify DNA as a genetic material in the molecular basis of information transfer.\n" +
                        "7. Analyse biological processes at the reductionistic level\n" +
                        "8. Apply thermodynamic principles to biological systems.\n" +
                        "9. Identify and classify microorganisms.");

//induction program
        List<String> InductionProgram = Arrays.asList("Induction Program (Mandatory)");

//open elective first
        List<String> OpenElectiveFirst = Arrays.asList("Data Science",
                "Computational Complexity",
                "Advanced Computer Architecture",
                "Theory of Computation",
                "Internet of Things",
                "Natural Language Processing",
                "E-Commerce And ERP",
                "Robotics And Robot Application");

//open elective second
        List<String> OpenElectiveSecond = Arrays.asList("Data Science",
                "Computational Complexity",
                "Advanced Computer Architecture",
                "Theory of Computation",
                "Internet of Things",
                "Natural Language Processing",
                "E-Commerce And ERP",
                "Robotics And Robot Application");

//programelective III
        List<String> ProgramElectiveThree = Arrays.asList("Data Science",
                "Computational Complexity",
                "Advanced Computer Architecture",
                "Theory of Computation",
                "Internet of Things",
                "Natural Language Processing",
                "E-Commerce And ERP",
                "Robotics And Robot Application");

//Project 1
        List<String> Projectirst = Arrays.asList("Project-|");

//Summer Entrepreneurship-|||
        List<String> SummerEntrepreneurshipThree = Arrays.asList("Summer Entrepreneurship-|||");

//Professional Elective Lab-|||
        List<String> ProfessionalElectiveLabSecond = Arrays.asList("Advance Networking(Cisco)\n Python as tool for Machine Learning \n Working on R \n Image Processing LAB \n Advanced AI Laboratory");



        List<Semester> seventhSemesters = new ArrayList<>();
        seventhSemesters.add(new Semester("Biology for Engineers", BiologyForEngineers));
        seventhSemesters.add(new Semester("Induction Program", InductionProgram));
        seventhSemesters.add(new Semester("Open Elective-|", OpenElectiveFirst));
        seventhSemesters.add(new Semester("Open Elective-|", OpenElectiveSecond));
        seventhSemesters.add(new Semester("Program Elective-|", ProgramElectiveThree));
        seventhSemesters.add(new Semester("Project-|", Projectirst));
        seventhSemesters.add(new Semester("Summer Entrepreneurship-|||", SummerEntrepreneurshipThree));
        seventhSemesters.add(new Semester("Professional Elective Lab-|||", ProfessionalElectiveLabSecond));

        branches.add(new Branch("Semester 7", seventhSemesters));
        //7th semester complete........




        //8 Semester start.....
        List<String> OpenElectivethree = Arrays.asList("VLSI System Design",
                "Embedded Systems",
                "Digital Signal Processing",
                "High Performance Computing",
                "Introduction To Communication Systems",
                "AD-HOC And Sensor Networks");


        List<String> OpenElectivefour = Arrays.asList("VLSI System Design",
                "Embedded Systems",
                "Digital Signal Processing",
                "High Performance Computing",
                "Introduction To Communication Systems",
                "AD-HOC And Sensor Networks");


        List<String> ProgramElectivefour = Arrays.asList("Data Mining",
                "Computational Number Theory",
                "Advanced Operating Systems",
                "Genetic Algorithm",
                "Cloud Computing",
                "Quantum Computing",
                "Transaction Processing Systems",
                "Pattern Recognition",
                "Deep Learning",
                "Computational Geometry",
                "Big Data Analytics",
                "Real Time Systems",
                "Block Chain",
                "Optimization Techniques",
                "Information Retrieval",
                "Bitcoin And CRYPTO Currencies");


        List<String> ProgramElectivefive = Arrays.asList("Data Mining",
                "Computational Number Theory",
                "Advanced Operating Systems",
                "Genetic Algorithm",
                "Cloud Computing",
                "Quantum Computing",
                "Transaction Processing Systems",
                "Pattern Recognition",
                "Deep Learning",
                "Computational Geometry",
                "Big Data Analytics",
                "Real Time Systems",
                "Block Chain",
                "Optimization Techniques",
                "Information Retrieval",
                "Bitcoin And CRYPTO Currencies");

        //Project two
        List<String> Project = Arrays.asList("Project-II");


        List<Semester> eightSemesters = new ArrayList<>();
        eightSemesters.add(new Semester("Open Elective-III", OpenElectivethree));
        eightSemesters.add(new Semester("Open Elective-IV", OpenElectivefour));
        eightSemesters.add(new Semester("Program Elective-IV", ProgramElectivefour));
        eightSemesters.add(new Semester("Program Elective-V", ProgramElectivefive));
        eightSemesters.add(new Semester("Project-II", Project));

        branches.add(new Branch("Semester 8", eightSemesters));






        return branches;
    }
}


