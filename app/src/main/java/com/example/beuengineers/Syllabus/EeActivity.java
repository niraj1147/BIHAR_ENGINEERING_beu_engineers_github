package com.example.beuengineers.Syllabus;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BranchAdapter branchAdapter;
    List<Branch> branchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ee);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        branchList = getBranches();
        branchAdapter = new BranchAdapter(branchList, this);
        recyclerView.setAdapter(branchAdapter);
    }

    private List<Branch> getBranches() {
        List<Branch> branches = new ArrayList<>();

        //1 Semester
        List<String> Chemistry = Arrays.asList("Chemistry\n" +
                " L:3 t:1 p:3 credit 5.5 \n" +
                "\n" +
                "Module 1: atomic and molecular structure (10 lectures) \n" +
                "\n" +
                "Failure of classical newtonian and maxwell wave mechanics to explain properties of particles at atomic and sub-atomic level; electromagnetic radiation, dual nature of electron and electromagnetic radiation, planks theory, photoelectric effect and heisenberg uncertainty principle. Failure of earlier theories to explain certain properties of molecules like paramagnetic properties. Principles for combination of atomic orbitals to form molecular orbitals. Formation of homo and hetero diatomic molecules and plots of energy level diagram of molecular orbitals. Coordination numbers and geometries, isomerism in transitional metal compounds, crystal field theory and the energy level diagrams for transition metal ions and their magnetic properties. \n" +
                "\n" +
                "Module 2: spectroscopic techniques and applications (8 lectures) \n" +
                "\n" +
                "Principles of vibrational and rotational spectroscopy and selection rules for application in diatomic molecules. Elementary idea of electronic spectroscopy. Uv-vis spectroscopy with related rules and its applications. Fluorescence and its applications in medicine. Basic principle of nuclear magnetic resonance and its application. Basics of magnetic resonance imaging. \n" +
                "\n" +
                "Module 3: intermolecular forces and properties of gases (4 lectures) \n" +
                "\n" +
                "Ionic, dipolar and van der waals interactions. Equations of state of ideal and real gases, deviation from ideal behaviour. Vander waal gas equation. \n" +
                "\n" +
                "Module 4: use of free energy in chemical equilibria and water chemistry (8 lectures) \n" +
                "\n" +
                "Thermodynamic functions: energy, enthalpy entropy and free energy. Equations to interrelate thermodynamic properties. Free energy, emf. And cell potentials, the nernst equation and applications. Corrosion. Use of free energy considerations in metallurgy through ellingham diagrams. Solubility equilibria. \n" +
                "\n" +
                "Water chemistry, hard and soft water. Parameters of quality of water to be used in different industries as for drinking water. Calculation of hardness of water in all units. Estimation of hardness using edta and alkalinity method. Removal of hardness by soda lime and ion exchange method including zeolite method \n" +
                "\n" +
                "Module 5: periodic properties (4 lectures) \n" +
                "\n" +
                "Effective nuclear charge, penetration of orbitals, variations of s, p, d and f orbital energies of atoms in the periodic table, electronic configurations, atomic and ionic sizes, ionization energies, electron affinity and \n" +
                "\n" +
                "Electronegativity, polarizability, acid, base, principle of hsab theory, oxidation states, hybridization and molecular geometries. \n" +
                "\n" +
                "Module 6: stereochemistry (4 lectures) \n" +
                "\n" +
                "Representations of 3-d structures, structural isomers and stereoisomers, configurations and symmetry and chirality, enantiomers, diastereomers, optical activity, absolute configurations and conformational analysis. \n" +
                "\n" +
                "Module 7: organic reactions and synthesis of a drug molecule (4 lectures) \n" +
                "\n" +
                "Introduction to intermediates and reactions involving substitution, addition, elimination, oxidation- reduction, diels elder cyclization and epoxide ring openings reactions. Synthesis of a commonly used drug molecule like aspirin. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Suggested text books: \n" +
                "~ university chemistry, by b. H. Mahan \n" +
                "~ chemistry: principles and applications, by m. J. Sienko and r. A. Plane \n" +
                "~ fundamentals of molecular spectroscopy, by c. N. Banwell \n" +
                "~ engineering chemistry (nptel web-book), by b. L. Tembe, kamaluddin and m. S. Krishnan \n" +
                "~ physical chemistry, by p. W. Atkins \n" +
                "~ organic chemistry: structure and function by k. P. C. Volhardt and n. E. Schore, 5th edition \n" +
                "~ http://bcs.Whfreeman.Com/vollhardtschore5e/default.Asp \n" +
                "\n" +
                "Chemistry laboratory \n" +
                "Choice of 10-12 experiments from the following \n" +
                "\n" +
                "~ determination of surface tension and viscosity \n" +
                "~ thin layer chromatography \n" +
                "~ ion exchange column for removal of hardness of water \n" +
                "~ determination of chloride content of water \n" +
                "~ colligative properties using freezing point depression \n" +
                "~ determination of the rate constant of a reaction \n" +
                "~ determination of cell constant and conductance of solutions \n" +
                "~ potentiometry - determination of redox potentials and emfs \n" +
                "~ synthesis of a polymer/drug \n" +
                "~ saponification/acid value of an oil \n" +
                "~ chemical analysis of a salt \n" +
                "~ lattice structures and packing of spheres \n" +
                "~ models of potential energy surfaces \n" +
                "~ chemical oscillations- iodine clock reaction \n" +
                "~ determination of the partition coefficient of a substance between two immiscible liquids \n" +
                "~ adsorption of acetic acid by charcoal \n" +
                "~ use of the capillary viscosimeters to the demonstrate of the isoelectric point as the ph of minimum viscosity for gelatin sols and/or coagulation of the white part of egg.");


        List<String> MathFirst = Arrays.asList("Mathematics –I\n" +
                "\n" +
                " (calculus and differential equations)\n" +
                "\n" +
                " L:3 t:1 p:0 credit:4\n" +
                "\n" +
                " Contents\n" +
                "\n" +
                " \n" +
                "\n" +
                "Module 1:\n" +
                "\n" +
                " Calculus (8 lectures)\n" +
                "\n" +
                " Evolutes and involutes; evaluation of definite and improper integrals; beta and gamma functions and their properties; applications of definite integrals to evaluate surface areas and volumes of revolutions. Rolles theorem, mean value theorems, taylors and maclaurin theorems with remainders; indeterminate forms and l hospital rule; maxima and minima. \n" +
                "\n" +
                "Module 2:\n" +
                "\n" +
                " Sequences and series (7 lectures)\n" +
                "\n" +
                " Convergence of sequence and series, tests for convergence, power series, taylors series. Series for exponential, trigonometric and logarithmic functions; fourier series: half range sine and cosine series, parsevals theorem. \n" +
                "\n" +
                "Module 3:\n" +
                "\n" +
                " Multivariable calculus: differentiation (6 lectures)\n" +
                "\n" +
                " Limit, continuity and partial derivatives, directional derivatives, total derivative; tangent plane and normal line; maxima, minima and saddle points; method of lagrange multipliers; gradient, curl and divergence. \n" +
                "\n" +
                "Module 4:\n" +
                "\n" +
                " Multivariable calculus: integration (7 lectures)\n" +
                "\n" +
                " Multiple integration: double and triple integrals (cartesian and polar), change of order of integration in double integrals, change of variables (cartesian to polar), applications: areas and volumes by (double integration) center of mass and gravity (constant and variable densities). Theorems of green, gauss and stokes, orthogonal curvilinear coordinates, simple applications involving cubes, sphere and rectangular parallelepipeds. \n" +
                "\n" +
                "Module 5:\n" +
                "\n" +
                " First order ordinary differential equations (3 lectures)\n" +
                "\n" +
                " Exact, linear and bernoulli equations, euler equations, equations not of first degree: equations solvable for p, equations solvable for y, equations solvable for x and clairauts type. \n" +
                "\n" +
                "Module 6:\n" +
                "\n" +
                " Ordinary differential equations of higher order (6 lectures)\n" +
                "\n" +
                " Second order linear differential equations with variable coefficients, method of variation of parameters, cauchy-euler equation; power series solutions; legendre polynomials, bessel functions of the first kind and their properties. \n" +
                "\n" +
                "Module 7:\n" +
                "\n" +
                " Partial differential equations: first order (3 lectures)\n" +
                "\n" +
                " First order partial differential equations, solutions of first order linear and non-linear pdes.\n" +
                "\n" +
                "\n" +
                "\n" +
                " \n" +
                "\n" +
                "Text / references:\n" +
                "\n" +
                "\n" +
                "\n" +
                " ~ g.B. Thomas and r.L. Finney, calculus and analytic geometry, pearson, 2002.\n" +
                " ~ t. Veerarajan, engineering mathematics, mcgraw-hill, new delhi, 2008.\n" +
                " ~ b. V. Ramana, higher engineering mathematics, mcgraw hill, new delhi, 2010.\n" +
                " ~ n.P. Bali and m. Goyal, a text book of engineering mathematics, laxmi publications, 2010.\n" +
                " ~ b.S. Grewal, higher engineering mathematics, khanna publishers, 2000.\n" +
                " ~ e. Kreyszig, advanced engineering mathematics, john wiley and sons, 2006.\n" +
                " ~ w. E. Boyce and r. C. Diprima, elementary differential equations and boundary value problems, wiley india, 2009.\n" +
                " ~ s. L. Ross, differential equations, wiley india, 1984.\n" +
                " ~ e. A. Coddington, an introduction to ordinary differential equations, prentice hall india, 1995.\n" +
                " ~ e. L. Ince, ordinary differential equations, dover publications, 1958.\n" +
                " ~ g.F. Simmons and s.G. Krantz, differential equations, mcgraw hill, 2007.");


        List<String> Pps = Arrays.asList("Programming for problem solving\n" +
                " L:3 t:0 p:4 credit:5 \n" +
                "\n" +
                "Module 1: introduction to programming (6 lectures) I\n" +
                "\n" +
                "Introduction to components of a computer system (disks, memory, processor, where a program is stored and executed, operating system, compilers etc). Idea of algorithm: steps to solve logical and numerical problems. Representation of algorithm: flowchart/pseudo code with examples. From algorithms to programs; source code, variables (with data types) variables and memory locations, type casting/type conversion, run time environment (static, dynamic location), storage classes (auto, register, static, extern), syntax and logical errors in compilation, object and executable code. \n" +
                "\n" +
                "Module 2: operators (3 lectures) \n" +
                "\n" +
                "Arithmetic expressions/arithmetic operators/relational operators/logical operators/bitwise operators and precedence \n" +
                "\n" +
                "Module 3: conditional branching and loops (5 lectures) \n" +
                "\n" +
                "Writing and evaluation of conditionals and consequent branching, iteration and loops \n" +
                "\n" +
                "Module 4: arrays (4 lectures) \n" +
                "\n" +
                "Array declaration and initialization, bound checking arrays (1-d, 2-d), character arrays and strings. \n" +
                "\n" +
                "Module 5: basic algorithms (6 lectures) \n" +
                "\n" +
                "Searching (linear search, binary search etc.), basic sorting algorithms (bubble, insertion and selection), finding roots of equations, notion of order of complexity through example programs (no formal definition required) \n" +
                "\n" +
                "Module 6: function (4 lectures) \n" +
                "\n" +
                "Introduction and writing functions, scope of variables functions (including using built in libraries), parameter passing in functions, call by value, passing arrays to functions: idea of call by reference \n" +
                "\n" +
                "Module 7: recursion (5 lectures) \n" +
                "\n" +
                "Recursion, as a different way of solving problems. Example programs, such as finding factorial, fibonacci series, reverse a string using recursion, and gcd of two numbers, ackerman function etc. Quick sort or merge sort. \n" +
                "\n" +
                "Module 8: structure/union (3 lectures) \n" +
                "\n" +
                "Structures, accessing structure elements, way of storage of structure element, defining structures and array of structures, basic definition of union, comparison between structure and union with example \n" +
                "\n" +
                "Module 9: pointers (5 lectures) \n" +
                "\n" +
                "Idea of pointers, defining pointers, use of pointers in self-referential structures, notion of linked list (no implementation), pointer to pointer, pointer to array, pointer to strings, array of pointer, pointer to function, pointer to structure. \n" +
                "\n" +
                "Module 10: file handling \n" +
                "\n" +
                "(only if time is available, otherwise should be done as part of the lab) \n" +
                "\n" +
                "\n" +
                "\n" +
                "Suggested text books: \n" +
                "~ byron gottfried, schaums outline of programming with c, mcgraw-hill \n" +
                "~ e. Balaguruswamy, programming in ansi c, tata mcgraw-hill \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Suggested reference books \n" +
                "~ brian w. Kernighan and dennis m. Ritchie, the c programming language, prentice hall of india \n" +
                "~ yashwant kanetkar, let us c, bpb publication \n" +
                "\n" +
                "\n" +
                "\n" +
                "The student will learn \n" +
                "~ to formulate simple algorithms for arithmetic and logical problems. \n" +
                "~ to translate the algorithms to programs (in c language). \n" +
                "~ to test and execute the programs and correct syntax and logical errors. \n" +
                "~ to implement conditional branching, iteration and recursion. \n" +
                "~ to decompose a problem into functions and synthesize a complete program using divide and conquer approach. \n" +
                "~ to use arrays, pointers and structures to formulate algorithms and programs. \n" +
                "~ to apply programming to solve matrix addition and multiplication problems and searching and sorting problems. \n" +
                "~ to apply programming to solve simple numerical method problems, namely rot finding of function, differentiation of function and simple integration. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Laboratory programming for problem solving \n" +
                "[the laboratory should be preceded or followed by a tutorial to explain the approach or algorithm to be implemented for the problem given.] \n" +
                "\n" +
                "Tutorial 1: problem solving using computers: \n" +
                "\n" +
                "Lab1: familiarization with programming environment \n" +
                "\n" +
                "Tutorial 2: variable types and type conversions: \n" +
                "\n" +
                "Lab 2: simple computational problems using arithmetic expressions \n" +
                "\n" +
                "Tutorial 3: branching and logical expressions: \n" +
                "\n" +
                "Lab 3: problems involving if-then-else structures \n" +
                "\n" +
                "Tutorial 4: loops, while and for loops: \n" +
                "\n" +
                "Lab 4: iterative problems e.G., sum of series \n" +
                "\n" +
                "Tutorial 5: 1d arrays: searching, sorting: \n" +
                "\n" +
                "Lab 5: 1d array manipulation \n" +
                "\n" +
                "Tutorial 6: 2d arrays and strings \n" +
                "\n" +
                "Lab 6: matrix problems, string operations \n" +
                "\n" +
                "Tutorial 7: functions, call by value: \n" +
                "\n" +
                "Lab 7: simple functions \n" +
                "\n" +
                "Tutorial 8: numerical methods (root finding, numerical differentiation, numerical integration): \n" +
                "\n" +
                "Lab 8: programming for solving numerical methods problems \n" +
                "\n" +
                "Tutorial 9: recursion, structure of recursive calls \n" +
                "\n" +
                "Lab 9: recursive functions \n" +
                "\n" +
                "Tutorial 10: pointers, structures and dynamic memory allocation \n" +
                "\n" +
                "Lab 10: pointers and structures \n" +
                "\n" +
                "Tutorial 11: file handling: \n" +
                "\n" +
                "Lab 11: file operations.");


        List<String> Workshop = Arrays.asList("Workshop manufacturing practices\n" +
                " L:1 t:0 p:4 credit:3 \n" +
                "\n" +
                "Lectures and videos: (10 hours) [l: 1; t: 0; p: 0 (1 credit)] \n" +
                "\n" +
                "Detailed contents: \n" +
                "1. Manufacturing methods-casting, forming, machining, joining, advanced manufacturing methods (3 lectures) \n" +
                "2. Cnc machining, additive manufacturing (1 lecture) \n" +
                "3. Fitting operations and power tools (1 lecture) \n" +
                "4. Carpentry (1 lecture) \n" +
                "5. Plastic moulding, glass cutting (1 lecture) \n" +
                "6. Metal casting (1 lecture) \n" +
                "7. Welding (arc welding and gas welding), brazing, soldering (2 lecture) \n" +
                "\n" +
                "\n" +
                "\n" +
                "Suggested text/reference books: \n" +
                "~hajra choudhury s.K., hajra choudhury a.K. And nirjhar roy s.K., elements of workshop technology, vol. I 2008 and vol. Ii 2010, media promoters and publishers private limited, mumbai. \n" +
                "~kalpakjian s. And steven s. Schmid, manufacturing engineering and technology, 4th edition, pearson education india edition, 2002. \n" +
                "~gowri p. Hariharan and a. Suresh babu,manufacturing technology – I pearson education, 2008. \n" +
                "~roy a. Lindberg, processes and materials of manufacture, 4th edition, prentice hall india, 1998. \n" +
                "~rao p.N., manufacturing technology, vol. I and vol. Ii, tata mcgrawhill house, 2017. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Course outcomes: \n" +
                "~upon completion of this course, the students will gain knowledge of the different manufacturing processes which are commonly employed in the industry, to fabricate components using different materials. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Workshop practice: (60 hours) [l: 0; t: 0; p: 4 (2 credits)] \n" +
                "1. Machine shop (10 hours) and fitting shop (8 hours) \n" +
                "2. Carpentry (6 hours) \n" +
                "3. Welding shop (8 hours) (arc welding 4 hrs + gas welding 4 hrs) \n" +
                "4. Casting (8 hours) and smithy (6 hours) \n" +
                "5. Plastic moulding and glass cutting (6 hours) \n" +
                "6. 3-d printing of different models (8 hours) \n" +
                "\n" +
                "\n" +
                "\n" +
                "Examinations could involve the actual fabrication of simple components, utilizing one or more of the techniques covered above.");


        List<String> English = Arrays.asList("English\n" +
                " L:2 t:0 p:2 credit:3 \n" +
                "\n" +
                "Detailed contents \n" +
                "\n" +
                "1.Vocabulary building \n" +
                "A. The concept of word formation \n" +
                "B. Root words from foreign languages and their use in english \n" +
                "C. Acquaintance with prefixes and suffixes from foreign languages in english to form derivatives. \n" +
                "D. Synonyms, antonyms, and standard abbreviations. \n" +
                "E. Affixes, acronyms \n" +
                "\n" +
                "2.Basic writing skills \n" +
                "A. Sentence structures \n" +
                "B. Use of phrases and clauses in sentences \n" +
                "C. Importance of proper punctuation \n" +
                "D. Kinds of sentences \n" +
                "E. Use of tense, use in context and coherence of tense in writing \n" +
                "F. Use of voice – active/passive in sentences \n" +
                "G. Use of speech – direct and indirect speech \n" +
                "H. Framing questions- direct, using modal verbs \n" +
                "\n" +
                "3.Identifying common errors in writing \n" +
                "A. Subject-verb agreement \n" +
                "B. Noun-pronoun agreement \n" +
                "C. Misplaced modifiers \n" +
                "D. Articles \n" +
                "E. Prepositions \n" +
                "F. Redundancies \n" +
                "G. Clichés \n" +
                "H. Common english errors \n" +
                "\n" +
                "4.Nature and style of sensible writing \n" +
                "A. Describing \n" +
                "B. Defining \n" +
                "C. Classifying \n" +
                "D. Providing examples or evidence \n" +
                "E. Writing introduction and conclusion \n" +
                "F. Organising principle of paragraphs in documents \n" +
                "G. Argument, describing/ narrating/ planning, defining,classifying \n" +
                "H. Lexical resources, using suitable language register \n" +
                "I. Coherence, writing introduction, body and conclusion, techniques for writing precisely,grammar and accuracy \n" +
                "\n" +
                "5.Writing practices \n" +
                "A. Comprehension \n" +
                "B. Formal letter writing/ application/ report writing/ writing minutes of meetings \n" +
                "C. Essay writing \n" +
                "D. Formal email writing \n" +
                "E. Resume/ cv writing, cover letter, \n" +
                "F. Statement of purpose \n" +
                "\n" +
                "6.Oral communication \n" +
                "\n" +
                "(this unit involves interactive practice sessions in language lab) \n" +
                "A. Listening comprehension \n" +
                "B. Pronunciation, intonation, stress and rhythm \n" +
                "C. Common everyday situations: conversations and dialogues \n" +
                "D. Communication at workplace \n" +
                "E. Interviews \n" +
                "F. Formal presentations \n" +
                "G. Acquainting students with ipa symbols \n" +
                "H. Phonetics (basic) \n" +
                "I. Sounds – vowels, consonants \n" +
                "J. Clearing mother tongue influence \n" +
                "K. Clearing redundancies and common errors related to indianisms \n" +
                "L. Group discussion \n" +
                "M. Expressing opinions \n" +
                "N. Coherence and fluency in speech \n" +
                "\n" +
                "7.Reading skills \n" +
                "A. Reading comprehension, \n" +
                "B. Paragraph reading based on phonetic sounds/ intonation \n" +
                "\n" +
                "8.Professional skills \n" +
                "A. Team building \n" +
                "B. Soft skills and etiquettes \n" +
                "\n" +
                "9.Acquaintance with technology-aided language learning \n" +
                "A. Use of computer software (grammarly, ginger…) \n" +
                "B. Use of smartphone applications (duolingo, busuu…) \n" +
                "\n" +
                "10.Activities \n" +
                "A. Narrative chain \n" +
                "B. Describing/ narrating \n" +
                "C. Writing essays in relay \n" +
                "D. Peer/ group activities \n" +
                "E. Brainstorming vocabulary \n" +
                "F. Cue / flash cards for vocabulary \n" +
                "G. Debates \n" +
                "\n" +
                "Suggested readings: \n" +
                "~practical english usage. Michael swan. Oup. 1995. \n" +
                "~remedial english grammar. F.T. Wood. Macmillan.2007 \n" +
                "~on writing well. William zinsser. Harper resource book. 2001 \n" +
                "~study writing. Liz hamp-lyons and ben heasly. Cambridge university press. 2006. \n" +
                "~communication skills. Sanjay kumar and pushplata. Oxford university press. 2011. \n" +
                "~exercises in spoken english. Parts. I-iii. Ciefl, hyderabad. Oxford university press.");


        List<Semester> firstSemesters = new ArrayList<>();
        firstSemesters.add(new Semester("Chemistry", Chemistry));
        firstSemesters.add(new Semester("Mathematics-I(Calculus And Differential Equations)", MathFirst));
        firstSemesters.add(new Semester("Programming for Problem Solving", Pps));
        firstSemesters.add(new Semester("Workshop Manufacturing Practices", Workshop));
        firstSemesters.add(new Semester("English", English));

        branches.add(new Branch("Semester 1", firstSemesters));
        //1st Semester end...



        //2 Semester Start.....
        List<String> BEE = Arrays.asList("Basic electrical engineering \n" +
                "L:3 t:1 p:2 credit:5 \n" +
                "\n" +
                " Module 1: dc circuits (8 lectures)\n" +
                "\n" +
                " Electrical circuit elements (r, l and c), voltage and current sources, kirchhoff current and voltage laws, analysis of simple circuits with dc excitation. Star-delta conversion, network theorems (superposition, thevenin, norton and maximum power transfer theorems). Time-domain analysis of first-order rl and rc circuits\n" +
                "\n" +
                " Module 2: ac circuits (8 lectures)\n" +
                "\n" +
                " Representation of sinusoidal waveforms, peak, rms and average values (form factor and peak factor), impedance of series and parallel circuit, phasor representation, real power, reactive power, apparent power, power factor, power triangle. Analysis of single-phase ac circuits consisting of r, l, c, rl, rc, rlc combinations (series and parallel), resonance. Three-phase balanced circuits, voltage and current relations in star and delta connections. \n" +
                "\n" +
                "Module 3: magnetic circuits: (4 lectures)\n" +
                "\n" +
                " Introduction, series and parallel magnetic circuits, analysis of series and parallel magnetic circuits. \n" +
                "\n" +
                "Module 4: transformers (6 lectures)\n" +
                "\n" +
                " Magnetic materials, bh characteristics, ideal and practical transformer, emf equation, equivalent circuit, losses in transformers, regulation and efficiency. Auto-transformer and three-phase transformer connections. \n" +
                "\n" +
                "Module 5: electrical machines (10 lectures)\n" +
                "\n" +
                " Construction, working, torque-speed characteristic and speed control of separately excited dc motor. Generation of rotating magnetic fields, construction and working of a three-phase induction motor, significance of torque-slip characteristic. Loss components and efficiency, starting and speed control of induction motor. Construction and working of synchronous generators. \n" +
                "\n" +
                "Module 6: electrical installations (6 lectures)\n" +
                "\n" +
                " Components of lt switchgear: switch fuse unit (sfu), mcb, elcb, mccb, types of wires and cables, earthing. Types of batteries, important characteristics for batteries. Elementary calculations for energy consumption, power factor improvement and battery backup. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Suggested text / reference books\n" +
                "\n" +
                " ~ d. P. Kothari and I. J. Nagrath, “basic electrical engineering”, tata mcgraw hill, 2010.\n" +
                "\n" +
                " ~ d. C. Kulshreshtha, “basic electrical engineering”, mcgraw hill, 2009.\n" +
                "\n" +
                " ~ l. S. Bobrow, “fundamentals of electrical engineering”, oxford university press, 2011.\n" +
                "\n" +
                " ~ e. Hughes, “electrical and electronics technology”, pearson, 2010.\n" +
                "\n" +
                " ~ v. D. Toro, “electrical engineering fundamentals”, prentice hall india, 1989.\n" +
                "\n" +
                " ~ basic electrical engineering by fitzerald, et al, tata mcgraw hill\n" +
                "\n" +
                " ~ fundamentals of electrical engg. By r. Prasad, phi publication\n" +
                "\n" +
                " ~ basic electrical engineering by v.K. Mehta and rohit mehta, s.Chand publication.");


        List<String> EGD = Arrays.asList("Engineering graphics and design \n" +
                "L:1 t:0 p:4 credit:3  \n" +
                "\n" +
                " Traditional engineering graphics:\n" +
                "\n" +
                " Principles of engineering graphics; orthographic projection; descriptive geometry; drawing principles; isometric projection; surface development; perspective; reading a drawing; sectional views; dimensioning and tolerances; true length, angle; intersection, shortest distance. \n" +
                "\n" +
                " Computer graphics:\n" +
                "\n" +
                " Engineering graphics software; -spatial transformations; orthographic projections; model viewing; co-ordinate systems; multi-view projection; exploded assembly; model viewing; animation; spatial manipulation; surface modelling; solid modelling, introduction to building information modelling (bim). \n" +
                "\n" +
                " (except the basic essential concepts, most of the teaching part can happen concurrently in the laboratory) \n" +
                "\n" +
                "  Module 1: introduction to engineering drawing \n" +
                "\n" +
                " Principles of engineering graphics and their significance, usage of drawing instruments, lettering, conic sections including the rectangular hyperbola (general method only); cycloid, epicycloid, hypocycloid and involute; scales – plain, diagonal and vernier scales \n" +
                "\n" +
                "Module 2: orthographic projections \n" +
                "\n" +
                "Principles of orthographic projections-conventions -projections of points and lines inclined to both planes; projections of planes inclined planes -auxiliary planes \n" +
                "\n" +
                "Module 3: projections of regular solids \n" +
                "\n" +
                "Those inclined to both the planes- auxiliary views; draw simple annotation, dimensioning and scale. Floor plans that include: windows, doors, and fixtures such as wc, bath, sink, shower, etc. \n" +
                "\n" +
                "Module 4: sections and sectional views of right angular solids \n" +
                "\n" +
                "Covering, prism, cylinder, pyramid, cone – auxiliary views; development of surfaces of right regular solids- prism, pyramid, cylinder and cone; draw the sectional orthographic views of geometrical solids, objects from industry and dwellings (foundation to slab only) \n" +
                "Nmodule 5: isometric projections \n" +
                "\n" +
                "Principles of isometric projection – isometric scale, isometric views, conventions; isometric views of lines, planes, simple and compound solids; conversion of isometric views to orthographic views and vice-versa, conventions \n" +
                "\n" +
                "Module 6: overview of computer graphics \n" +
                "\n" +
                "Listing the computer technologies that impact on graphical communication, demonstrating knowledge of the theory of cad software [such as: the menu system, toolbars (standard, object properties, draw, modify and dimension), drawing area (background, crosshairs, coordinate system), dialog boxes and windows, shortcut menus (button bars), the command line (where applicable), the status bar, different methods of zoom as used in cad, select and erase objects.; isometric views of lines, planes, simple and compound solids] \n" +
                "\n" +
                "Module 7: customisation and cad drawing \n" +
                "\n" +
                "Consisting of set up of the drawing page and the printer, including scale settings, setting up of units and drawing limits; iso and ansi standards for coordinate dimensioning and tolerancing; orthographic constraints, snap to objects manually and automatically; producing drawings by using various coordinate input entry methods to draw straight lines, applying various ways of drawing circles. \n" +
                "\n" +
                "Module 8: annotations, layering and other functions \n" +
                "\n" +
                "Covering applying dimensions to objects, applying annotations to drawings; setting up and use of layers, layers to create drawings, create, edit and use customized layers; changing line lengths through modifying existing lines (extend/lengthen); printing documents to paper using the print command; orthographic projection techniques; drawing sectional views of composite right regular geometric solids and project the true shape of the sectioned surface; drawing annotation, computer-aided design (cad) software modeling of parts and assemblies. Parametric and non-parametric solid, surface, and wireframe models. Part editing and two-dimensional documentation of models. Planar projection theory, including sketching of perspective, isometric, multiview, auxiliary, and section views. Spatial visualization exercises. Dimensioning guidelines, tolerancing techniques; dimensioning and scale multi views of dwelling. \n" +
                "\n" +
                "Module 9: demonstration of a simple team design project that illustrates \n" +
                "\n" +
                "Geometry and topology of engineered components: creation of engineering models and their presentation in standard 2d blueprint form and as 3d wire-frame and shaded solids; meshed topologies for engineering analysis and tool-path generation for component manufacture; geometric dimensioning and tolerancing; use of solid-modeling software for creating associative models at the component and assembly levels. Floor plans that include: windows, doors, and fixtures such as wc, bath, sink, shower, etc. Applying colour coding according to building drawing practice; drawing sectional elevation showing foundation to ceiling; introduction to building information modelling (bim). \n" +
                "\n" +
                "Suggested text/reference books: \n" +
                " \n" +
                "~ bhatt n.D., panchal v.M. And ingle p.R., (2014), engineering drawing, charotar publishing house \n" +
                "~ shah, m.B. And rana b.C. (2008), engineering drawing and computer graphics, pearson education \n" +
                "~ agrawal b. And agrawal c. M. (2012), engineering graphics, tmh publication \n" +
                "~ narayana, k.L. And p kannaiah (2008), text book on engineering drawing, scitechpublishers \n" +
                "~ (corresponding set of) cad software theory and user manuals.");


        List<String> MatheSecond = Arrays.asList("Mathematics –ii\n" +
                "\n" +
                " (linear algebra, transform calculus and numerical methods)\n" +
                "\n" +
                " L:3 t:1 p:0 credit:4\n" +
                "\n" +
                " \n" +
                "\n" +
                "Module 1:\n" +
                "\n" +
                " Matrices (10 lectures)\n" +
                "\n" +
                " Algebra of matrices, inverse and rank of a matrix, rank-nullity theorem; system of linear equations; symmetric, skew-symmetric and orthogonal matrices; determinants; eigenvalues and eigenvectors; diagonalization of matrices; cayley-hamilton theorem, orthogonal transformation and quadratic to canonical forms. \n" +
                "\n" +
                "Module 2:\n" +
                "\n" +
                " Numerical methods-I (10 lectures)\n" +
                "\n" +
                " Solution of polynomial and transcendental equations – bisection method, newton-raphson method and regula-falsi method. Finite differences, interpolation using newton’s forward and backward difference formulae. Central difference interpolation: gauss’s forward and backward formulae. Numerical integration: trapezoidal rule and simpson’s 1/3rd and 3/8 rules. \n" +
                "\n" +
                "Module 3:\n" +
                "\n" +
                " Numerical methods-ii (10 lectures)\n" +
                "\n" +
                " Ordinary differential equations: taylors series, euler and modified eulers methods. Runge- kutta method of fourth order for solving first and second order equations. Milne’s and adam’s predicator-corrector methods. Partial differential equations: finite difference solution two dimensional laplace equation and poisson equation, implicit and explicit methods for one dimensional heat equation (bender-schmidt and crank-nicholson methods), finite difference explicit method for wave equation. \n" +
                "\n" +
                "Module 4:\n" +
                "\n" +
                " Transform calculus (10 lectures)\n" +
                "\n" +
                " Laplace transform, properties of laplace transform, laplace transform of periodic functions. Finding inverse laplace transform by different methods, convolution theorem. Evaluation of integrals by laplace transform, solving odes and pdes by laplace transform method. Fourier transforms. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Text / references:\n" +
                "\n" +
                " ~ d. Poole,linear algebra: a modern introduction, brooks/cole, 2005. ~ n.P. Bali and m. Goyal, a text book of engineering mathematics, laxmi publications, 2008. ~ b.S. Grewal, higher engineering mathematics, khanna publishers, 2010. ~ v. Krishnamurthy, v. P. Mainra and j. L. Arora, an introduction to linear algebra , affiliated east-west press, 2005.");


        List<String> WavePHY = Arrays.asList("Physics \n" +
                "\n" +
                "(waves and optics, and introduction to quantum mechanics)\n" +
                "\n" +
                " L:3 t:1 p:3\n" +
                "\n" +
                " Credit:5.5\n" +
                "\n" +
                " Contents\n" +
                "\n" +
                " \n" +
                "\n" +
                "Module 1:\n" +
                "\n" +
                " Waves (3 lectures)\n" +
                "\n" +
                " Mechanical and electrical simple harmonic oscillators, damped harmonic oscillator, forced mechanical and electrical oscillators, impedance, steady state motion of forced damped harmonic oscillator \n" +
                "\n" +
                "Module 2:\n" +
                "\n" +
                " Non-dispersive transverse and longitudinal waves (4 lectures) transverse wave on a string, the wave equation on a string, harmonic waves, reflection and transmission of waves at a boundary, impedance matching, standing waves and their eigen frequencies, longitudinal waves and the wave equation for them, acoustics waves \n" +
                "\n" +
                "Module 3:\n" +
                "\n" +
                " Light and optics (3 lectures)\n" +
                "\n" +
                " Light as an electromagnetic wave and fresnel equations, reflectance and transmittance, brewster’s angle, total internal reflection, and evanescent wave. Mirrors and lenses and optical instruments based on them \n" +
                "\n" +
                "Module 4: \n" +
                "\n" +
                "Wave optics (5 lectures)\n" +
                "\n" +
                " Huygens’ principle, superposition of waves and interference of light by wavefront splitting and amplitude splitting; young’s double slit experiment, newton’s rings, michelson interferometer, mach zehnder interferometer. Farunhofer diffraction from a single slit and a circular aperture, the rayleigh criterion for limit of resolution and its application to vision; diffraction gratings and their resolving power \n" +
                "\n" +
                "Module 5:\n" +
                "\n" +
                " Lasers (5 lectures)\n" +
                "\n" +
                " Einstein’s theory of matter radiation interaction and a and b coefficients; amplification of light by population inversion, different types of lasers: gas lasers (he-ne, co2), solid-state lasers (ruby, neodymium), dye lasers; properties of laser beams: mono-chromaticity \n" +
                "\n" +
                "Module 6: \n" +
                "\n" +
                "Introduction to quantum mechanics (5 lectures)\n" +
                "\n" +
                " Wave nature of particles, time-dependent and time-independent schrodinger equation for wave function, born interpretation, probability current, expectation values, free-particle wave function and wave-packets, uncertainty principle. \n" +
                "\n" +
                "Module 7:\n" +
                "\n" +
                " Solution of wave equation (6 lectures)\n" +
                "\n" +
                " Solution of stationary-state schrodinger equation for one dimensional problems–particle in a box, particle in attractive delta-function potential, square-well potential, linear harmonic oscillator. Scattering from a potential barrier and tunneling; related examples like alpha- decay, field-ionization and scanning tunneling microscope, tunneling in semiconductor structures. Three-dimensional problems: particle in three dimensional box and related examples. \n" +
                "\n" +
                "Module 8:\n" +
                "\n" +
                " Introduction to solids and semiconductors (9 lectures)\n" +
                "\n" +
                " Free electron theory of metals, fermi level, density of states in 1, 2 and 3 dimensions, bloch’s theorem for particles in a periodic potential, kronig-penney model and origin of energy bands. Types of electronic materials: metals, semiconductors, and insulators. Intrinsic and extrinsic semiconductors, dependence of fermi level on carrier-concentration and temperature (equilibrium carrier statistics), carrier generation and recombination, carrier transport: diffusion and drift, p -n junction. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Text / references:\n" +
                "\n" +
                "\n" +
                "\n" +
                " ~ g. Main, vibrations and waves in physics, cambridge university press, 1993.\n" +
                " ~ h. J. Pain, the physics of vibrations and waves, wiley, 2006.\n" +
                " ~ e. Hecht, optics, pearson education, 2008.\n" +
                " ~ a. Ghatak, optics, mcgraw hill education, 2012.\n" +
                " ~ o. Svelto, principles of lasers, springer science and business media, 2010.\n" +
                " ~ d. J. Griffiths, quantum mechanics, pearson education, 2014.\n" +
                " ~ r. Robinett, quantum mechanics, oup oxford, 2006.\n" +
                " ~ d. Mcquarrie, uantum chemistry, university science books, 2007.\n" +
                " ~ d. A. Neamen, semiconductor physics and devices, times mirror high education group, chicago, 1997.\n" +
                " ~ e.S. Yang, microelectronic devices, mcgraw hill, singapore, 1988.\n" +
                " ~ b.G. Streetman, solid state electronic devices, prentice hall of india, 1995.");


        List<Semester> secondSemesters = new ArrayList<>();
        secondSemesters.add(new Semester("Basic Electrical Engineering", BEE));
        secondSemesters.add(new Semester("Engineering Graphics and Design", EGD));
        secondSemesters.add(new Semester("Mathematics-II (Linear Algebra,Transform Calculus And Numerical Methods)", MatheSecond));
        secondSemesters.add(new Semester("Physics (Wave And Optics And Introduction to Quantum Mechanics)", WavePHY));

        branches.add(new Branch("Semester 2", secondSemesters));
        //2nd Semester end.....



        //3 Semester Start.......
        List<String> ElectricalCircuitAnalysis = Arrays.asList("Course Outcomes:\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "\uF0B7 Apply network theorems for the analysis of electrical circuits.\n" +
                "\n" +
                "\uF0B7 Obtain the transient and steady-state response of electrical circuits.\n" +
                "\n" +
                "\uF0B7 Analyse circuits in the sinusoidal steady-state (single-phase and three-phase).\n" +
                "\n" +
                "\uF0B7 Analyse two port circuit behavior.\n" +
                "\n" +
                "Module 1: Network Theorems (10 Hours)\n" +
                "\n" +
                "Superposition theorem, Thevenin theorem, Norton theorem, Maximum power transfer theorem, Reciprocity theorem, Compensation theorem. Analysis with dependent current and voltage sources. Node and Mesh Analysis. Concept of duality and dual networks.\n" +
                "\n" +
                "Module 2: Solution of First and Second order networks (8 Hours)\n" +
                "\n" +
                "Solution of first and second order differential equations for Series and parallel R-L, R-C, R-L-C circuits, initial and final conditions in network elements, forced and free response, time constants, steady state and transient state response.\n" +
                "\n" +
                "Module 3: Sinusoidal steady state analysis (8 Hours)\n" +
                "\n" +
                "Representation of sine function as rotating phasor, phasor diagrams, impedances and admittances, AC circuit analysis, effective or RMS values, average power and complex power. Three-phase circuits. Mutual coupled circuits, Dot Convention in coupled circuits, Ideal Transformer.\n" +
                "\n" +
                "Module 4: Electrical Circuit Analysis Using Laplace Transforms (8 Hours)\n" +
                "\n" +
                "Review of Laplace Transform, Analysis of electrical circuits using Laplace Transform for standard inputs, convolution integral, inverse Laplace transform, transformed network with initial conditions. Transfer function representation. Poles and Zeros. Frequency response (magnitude and phase plots), series and parallel resonances\n" +
                "\n" +
                "Module 5: Two Port Network and Network Functions (6 Hours)\n" +
                "\n" +
                "Two Port Networks, terminal pairs, relationship of two port variables, impedance parameters, admittance parameters, transmission parameters and hybrid parameters, interconnections of two port networks.\n" +
                "\n" +
                "Text / References:\n" +
                "\n" +
                "1. M. E. Van Valkenburg, “Network Analysis”, Prentice Hall, 2006.\n" +
                "\n" +
                "2. D. Roy Choudhury, “Networks and Systems”, New Age International Publications, 1998.\n" +
                "\n" +
                "3. W. H. Hayt and J. E. Kemmerly, “Engineering Circuit Analysis”, McGraw Hill Education, 2013.\n" +
                "\n" +
                "4. C. K. Alexander and M. N. O. Sadiku, “Electric Circuits”, McGraw Hill Education, 2004.\n" +
                "\n" +
                "5. K. V. V. Murthy and M. S. Kamath, “Basic Circuit Analysis”, Jaico Publishers, 1999.");


        List<String> ElectricalCircuitAnalysisLAB = Arrays.asList("Electrical Circuit Analysis LAB");


        List<String> AnalogElectronics = Arrays.asList("Course Outcomes:\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "\uF0B7 Understand the characteristics of transistors.\uF020\n" +
                "\n" +
                "\uF0B7 Design and analyse various rectifier and amplifier circuits.\uF020\n" +
                "\n" +
                "\uF0B7 Design sinusoidal and non-sinusoidal oscillators.\uF020\n" +
                "\n" +
                "\uF0B7 Understand the functioning of OP-AMP and design OP-AMP based circuits.\uF020\n" +
                "\n" +
                "Module 1: Diode circuits (4 Hours)\n" +
                "\n" +
                "P-N junction diode, I-V characteristics of a diode; review of half-wave and full-wave rectifiers, Zener diodes, clamping and clipping circuits.\n" +
                "\n" +
                "Module 2: BJT circuits (8 Hours)\n" +
                "\n" +
                "Structure and I-V characteristics of a BJT; BJT as a switch. BJT as an amplifier: small-signal model, biasing circuits, current mirror; common-emitter, common-base and common-collector amplifiers; Small signal equivalent circuits, high-frequency equivalent circuits\n" +
                "\n" +
                "Module 3: MOSFET circuits (8 Hours)\n" +
                "\n" +
                "MOSFET structure and I-V characteristics. MOSFET as a switch. MOSFET as an amplifier: small-signal model and biasing circuits, common-source, common-gate and common-drain amplifiers; small signal equivalent circuits - gain, input and output impedances, trans-conductance, high frequency equivalent circuit.\n" +
                "\n" +
                "Module 4: Differential, multi-stage and operational amplifiers (8 Hours)\n" +
                "\n" +
                "Differential amplifier; power amplifier; direct coupled multi-stage amplifier; internal structure of an operational amplifier, ideal op-amp, non-idealities in an op-amp (Output offset voltage, input bias current, input offset current, slew rate, gain bandwidth product)\n" +
                "\n" +
                "Module 5: Linear applications of op-amp (8 Hours)\n" +
                "\n" +
                "Idealized analysis of op-amp circuits. Inverting and non-inverting amplifier, differential amplifier, instrumentation amplifier, integrator, active filter, P, PI and PID controllers and lead/lag compensator using an op-amp, voltage regulator, oscillators (Wein bridge and phase shift).\n" +
                "\n" +
                "Analog to Digital Conversion.\n" +
                "\n" +
                "Module 6: Nonlinear applications of op-amp (6 Hours)\n" +
                "\n" +
                "Hysteretic Comparator, Zero Crossing Detector, Square-wave and triangular-wave generators. Precision rectifier, peak detector. Monoshot.\n" +
                "\n" +
                "Text/References:\n" +
                "\n" +
                "1. A. S. Sedra and K. C. Smith, “Microelectronic Circuits”, New York, Oxford University Press, 1998.\n" +
                "\n" +
                "2. J. V. Wait, L. P. Huelsman and G. A. Korn, “Introduction to Operational Amplifier theory and applications”, McGraw Hill U. S., 1992.\n" +
                "\n" +
                "3. J. Millman and A. Grabel, “Microelectronics”, McGraw Hill Education, 1988.\n" +
                "\n" +
                "4. P. Horowitz and W. Hill, “The Art of Electronics”, Cambridge University Press, 1989.\n" +
                "\n" +
                "5. P.R. Gray, R.G. Meyer and S. Lewis, “Analysis and Design of Analog Integrated Circuits”, John Wiley & Sons, 2001.");


        List<String> AnalogElectronicsLAB = Arrays.asList("Analog Electronics LAB");


        List<String> ElectricalMachinesFirst = Arrays.asList("Course Outcomes:\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "\uF0B7 Understand the concepts of magnetic circuits.\n" +
                "\n" +
                "\uF0B7 Understand the operation of dc machines.\n" +
                "\n" +
                "\uF0B7 Analyse the differences in operation of different dc machine configurations.\n" +
                "\n" +
                "\uF0B7 Analyse single phase and three phase transformers circuits.\n" +
                "\n" +
                "Module 1: Magnetic fields and magnetic circuits (6 Hours)\n" +
                "\n" +
                "Review of magnetic circuits - MMF, flux, reluctance, inductance; review of Ampere Law and Biot Savart Law; Visualization of magnetic fields produced by a bar magnet and a current carrying coil - through air and through a combination of iron and air; influence of highly permeable materials on the magnetic flux lines.\n" +
                "\n" +
                "Module 2: Electromagnetic force and torque (9 Hours)\n" +
                "\n" +
                "B-H curve of magnetic materials; flux-linkage vs current characteristic of magnetic circuits; linear and nonlinear magnetic circuits; energy stored in the magnetic circuit; force as a partial derivative of stored energy with respect to position of a moving element; torque as a partial derivative of stored energy with respect to angular position of a rotating element. Examples - galvanometer coil, relay contact, lifting magnet, rotating element with eccentricity or saliency\n" +
                "\n" +
                "Module 3: Transformers (12 Hours)\n" +
                "\n" +
                "Principle, construction and operation of single-phase transformers, equivalent circuit, phasor diagram, voltage regulation, losses and efficiency Testing - open circuit and short circuit tests, polarity test, back- to-back test, separation of hysteresis and eddy current losses Three-phase transformer - construction, types of connection and their comparative features, Parallel operation of single-phase and three-phase transformers, Autotransformers - construction, principle, applications and comparison with two winding transformer, Magnetizing current, effect of nonlinear B-H curve of magnetic core material, harmonics in magnetization current, Phase conversion - Scott connection, three-phase to six-phase conversion, Tap-changing transformers - No-load and on-load tap-changing of transformers, Three-winding transformers. Cooling of transformers.\n" +
                "\n" +
                "Module 4: DC machines (8 Hours)\n" +
                "\n" +
                "Basic construction of a DC machine, magnetic structure - stator yoke, stator poles, pole-faces or shoes, air gap and armature core, visualization of magnetic field produced by the field winding excitation with armature winding open, air gap flux density distribution, flux per pole, induced EMF in an armature coil. Armature winding and commutation - Elementary armature coil and commutator, lap and wave windings, construction of commutator, linear commutation Derivation of back EMF equation, armature MMF wave, derivation of torque equation, armature reaction, air gap flux density distribution with armature reaction.\n" +
                "\n" +
                "Module 5: DC machine - motoring and generation (7 Hours)\n" +
                "\n" +
                "Armature circuit equation for motoring and generation, Types of field excitations - separately excited, shunt and series. Open circuit characteristic of separately excited DC generator, back EMF with armature reaction, voltage build-up in a shunt generator, critical field resistance and critical speed. V- I characteristics and torque-speed characteristics of separately excited, shunt and series motors. Speed control through armature voltage. Losses, load testing and back-to-back testing of DC machines\n" +
                "\n" +
                "Text / References:\n" +
                "\n" +
                "1. A. E. Fitzgerald and C. Kingsley, \"Electric Machinery”, New York, McGraw Hill Education,\n" +
                "\n" +
                "Page 36 of 75\n" +
                "\n" +
                "2013.\n" +
                "\n" +
                "2. A. E. Clayton and N. N. Hancock, “Performance and design of DC machines”, CBS Publishers, 2004.\n" +
                "\n" +
                "3. M. G. Say, “Performance and design of AC machines”, CBS Publishers, 2002.\n" +
                "\n" +
                "4. P. S. Bimbhra, “Electrical Machinery”, Khanna Publishers, 2011.\n" +
                "\n" +
                "5. I. J. Nagrath and D. P. Kothari, “Electric Machines”, McGraw Hill Education, 2010.");


        List<String> ElectricalMachinesFirstLAB = Arrays.asList("Electrical Machines LAB-I");


        List<String> ElectromagneticFields = Arrays.asList("Course Outcomes:\n" +
                "\n" +
                "At the end of the course, students will demonstrate the ability\n" +
                "\n" +
                "\uF0B7 To understand the basic laws of electromagnetism.\n" +
                "\n" +
                "\uF0B7 To obtain the electric and magnetic fields for simple configurations under static conditions.\n" +
                "\n" +
                "\uF0B7 To analyse time varying electric and magnetic fields.\n" +
                "\n" +
                "\uF0B7 To understand Maxwell’s equation in different forms and different media.\n" +
                "\n" +
                "\uF0B7 To understand the propagation of EM waves.\n" +
                "\n" +
                "This course shall have Lectures and Tutorials. Most of the students find difficult to visualize electric and magnetic fields. Instructors may demonstrate various simulation tools to visualize electric and magnetic fields in practical devices like transformers, transmission lines and machines.\n" +
                "\n" +
                "Module 1: Review of Vector Calculus (6 hours)\n" +
                "\n" +
                "Vectoralgebra-addition, subtraction, components of vectors, scalar and vector multiplications, triple products, three orthogonal coordinate systems (rectangular, cylindrical and spherical). Vector calculus-differentiation, partial differentiation, integration, vector operator del, gradient, divergence and curl;integraltheorems of vectors. Conversion of a vector from one coordinate system to an other.\n" +
                "\n" +
                "Module 2: Static Electric Field (6 Hours)\n" +
                "\n" +
                "Coulomb’s law, Electric field intensity, Electrical field due to point charges. Line, Surface and Volume charge distributions. Gauss law and its applications. Absolute Electric potential, Potential difference, Calculation of potential differences for different configurations. Electric dipole, Electrostatic Energy and Energy density.\n" +
                "\n" +
                "37 | P a g e\n" +
                "\n" +
                "Module 3: Conductors, Dielectrics and Capacitance (6 Hours)\n" +
                "\n" +
                "Current and current density, Ohms Law in Point form, Continuity of current, Boundary conditions of perfect dielectric materials. Permittivity of dielectric materials, Capacitance, Capacitance of a two wire line, Poisson’s equation, Laplace’s equation, Solution of Laplace and Poisson’s equation, Application of Laplace’s and Poisson’s equations.\n" +
                "\n" +
                "Module 4: Static Magnetic Fields (6 Hours)\n" +
                "\n" +
                "Biot-Savart Law, Ampere Law, Magnetic flux and magnetic flux density, Scalar and Vector Magnetic potentials. Steady magnetic fields produced by current carrying conductors.\n" +
                "\n" +
                "Module 5: Magnetic Forces, Materials and Inductance (6 Hours)\n" +
                "\n" +
                "Force on a moving charge, Force on a differential current element, Force between differential current elements, Nature of magnetic materials, Magnetization and permeability, Magnetic boundary\n" +
                "\n" +
                "conditions, Magnetic circuits, inductances and mutual inductances.\n" +
                "\n" +
                "Module 6: Time Varying Fields and Maxwell’s Equations (6 Hours)\n" +
                "\n" +
                "Faraday’s law for Electromagnetic induction, Displacement current, Point form of Maxwell’s equation, Integral form of Maxwell’s equations, Motional Electromotive forces. Boundary Conditions.\n" +
                "\n" +
                "Module 7: Electromagnetic Waves (6 Hours)\n" +
                "\n" +
                "Derivation of Wave Equation, Uniform Plane Waves, Maxwell’s equation in Phasor form, Wave equation in Phasor form, Plane waves in free space and in a homogenous material. Wave equation for a conducting medium, Plane waves in lossy dielectrics, Propagation in good conductors, Skin effect. Poynting theorem.\n" +
                "\n" +
                "Text / References:\n" +
                "\n" +
                "1. M. N. O. Sadiku, “Elements of Electromagnetics”, Oxford University Publication, 2014.\n" +
                "\n" +
                "2. A. Pramanik, “Electromagnetism - Theory and applications”, PHI Learning Pvt. Ltd, New Delhi, 2009.\n" +
                "\n" +
                "3. A. Pramanik, “Electromagnetism-Problems with solution”, Prentice Hall India, 2012.\n" +
                "\n" +
                "4. G.W. Carter, “The electromagnetic field in its engineering aspects”, Longmans, 1954.\n" +
                "\n" +
                "5. W.J. Duffin, “Electricity and Magnetism”, McGraw Hill Publication, 1980.\n" +
                "\n" +
                "6. W.J. Duffin, “Advanced Electricity and Magnetism”, McGraw Hill, 1968.\n" +
                "\n" +
                "7. E.G. Cullwick, “The Fundamentals of Electromagnetism”, Cambridge University Press, 1966.\n" +
                "\n" +
                "8. B. D. Popovic, “Introductory Engineering Electromagnetics”, Addison-Wesley Educational Publishers, International Edition, 1971.\n" +
                "\n" +
                "9. W. Hayt, “Engineering Electromagnetics”, McGraw Hill Education, 2012.");


        List<String> EngineeringMechanics = Arrays.asList("Course Outcomes:\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "\uF0B7 Understand the concepts of co-ordinate systems.\uF020\n" +
                "\n" +
                "\uF0B7 Analyse the three-dimensional motion.\uF020\n" +
                "\n" +
                "\uF0B7 Understand the concepts of rigid bodies.\uF020\n" +
                "\n" +
                "\uF0B7 Analyse the free-body diagrams of different arrangements.\uF020\n" +
                "\n" +
                "\uF0B7 Analyse torsional motion and bending moment.\uF020\n" +
                "\n" +
                "Module 1: Introduction to vectors and tensors and co-ordinate systems (5 hours)\n" +
                "\n" +
                "Introduction to vectors and tensors and coordinate systems; Vector and tensor algebra; Indical notation; Symmetric and anti-symmetric tensors; Eigenvalues and Principal axes.\n" +
                "\n" +
                "Module 2: Three-dimensional Rotation (4 hours)\n" +
                "\n" +
                "Three-dimensional rotation: Euler’s theorem, Axis-angle formulation and Euler angles; Coordinate transformation of vectors and tensors.\n" +
                "\n" +
                "38 | P a g e\n" +
                "\n" +
                "Module 3: Kinematics of Rigid Body (6 hours)\n" +
                "\n" +
                "Kinematics of rigid bodies: Dentition and motion of a rigid body; Rigid bodies as coordinate systems; Angular velocity of a rigid body, and its rate of change; Distinction between two-and three- dimensional rotational motion; Integration of angular velocity to find orientation; Motion relative to a rotating rigid body: Five term acceleration formula.\n" +
                "\n" +
                "Module 4: Kinetics of Rigid Bodies (5 hours)\n" +
                "\n" +
                "Kinetics of rigid bodies: Angular momentum about a point; Inertia tensor: Dentition and computation, Principal moments and axes of inertia, Parallel and perpendicular axes theorems; Mass moment of inertia of symmetrical bodies, cylinder, sphere, cone etc., Area moment of inertia and Polar moment of inertia, Forces and moments; Newton-Euler’s laws of rigid body motion.\n" +
                "\n" +
                "Module 5: Free Body Diagram (1 hour)\n" +
                "\n" +
                "Free body diagrams; Examples on modelling of typical supports and joints and discussion on the kinematic and kinetic constraints that they impose.\n" +
                "\n" +
                "Module 6: General Motion (9 hours)\n" +
                "\n" +
                "Examples and problems. General planar motions. General 3-D motions. Free precession, Gyroscopes, Rolling coin.\n" +
                "\n" +
                "Module 7: Bending Moment (5 hours)\n" +
                "\n" +
                "Transverse loading on beams, shear force and bending moment in beams, analysis of cantilevers, simply supported beams and overhanging beams, relationships between loading, shear force and bending moment, shear force and bending moment diagrams.\n" +
                "\n" +
                "Module 8: Torsional Motion (2 hours)\n" +
                "\n" +
                "Torsion of circular shafts, derivation of torsion equation, stress and deformation in circular and hollow shafts.\n" +
                "\n" +
                "Module 9: Friction (3 hours)\n" +
                "\n" +
                "Concept of Friction; Laws of Coulomb friction; Angle of Repose; Coefficient of friction.\n" +
                "\n" +
                "Text / References:\n" +
                "\n" +
                "1. J. L. Meriam and L. G. Kraige, “Engineering Mechanics: Dynamics”, Wiley, 2011.\n" +
                "\n" +
                "2. M. F. Beatty, “Principles of Engineering Mechanics”, Springer Science & Business Media, 1986.");


        List<String> EnvironmentalScience = Arrays.asList("Environmental Science/Indian Constitution.");


        List<String> IndustrialVisit = Arrays.asList("Industrial Visit/Internship(4 WEEKS).");


        List<String> SoftwareTraining = Arrays.asList("Software Training.");


        List<Semester> thirdSemesters = new ArrayList<>();
        thirdSemesters.add(new Semester("Electrical Circuit Analysis", ElectricalCircuitAnalysis));
        thirdSemesters.add(new Semester("Electrical Circuit Analysis LAB", ElectricalCircuitAnalysisLAB));
        thirdSemesters.add(new Semester("Analog Electronics", AnalogElectronics));
        thirdSemesters.add(new Semester("Analog Electronics LAB", AnalogElectronicsLAB));
        thirdSemesters.add(new Semester("Electrical Machines-I", ElectricalMachinesFirst));
        thirdSemesters.add(new Semester("Electrical Machines LAB -I", ElectricalMachinesFirstLAB));
        thirdSemesters.add(new Semester("Electromagnetic Fields", ElectromagneticFields));
        thirdSemesters.add(new Semester("Engineering Mechanics", EngineeringMechanics));
        thirdSemesters.add(new Semester("Environmental Science/Indian Constitution", EnvironmentalScience));
        thirdSemesters.add(new Semester("Industrial Visit/Internship(4 WEEKS)", IndustrialVisit));
        thirdSemesters.add(new Semester("Software Training", SoftwareTraining));

        branches.add(new Branch("Semester 3", thirdSemesters));
        //3rd Semester Complete.....



        //4 Semester Start.....
        List<String> DigitalElectronics = Arrays.asList("Course Outcomes: \n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to \n" +
                "\n" +
                "• Understand working of logic families and logic gates. \n" +
                "\n" +
                "• Design and implement Combinational and Sequential logic circuits. \n" +
                "\n" +
                "• Understand the process of Analog to Digital conversion and Digital to Analog conversion. \n" +
                "\n" +
                "• Be able to use PLDs to implement the given logical problem. \n" +
                "\n" +
                "Module 1:Fundamentals of Digital Systems and logic families (7Hours)\n" +
                "\n" +
                " Digitalsignals,digitalcircuits,AND,OR,NOT,NAND,NORandExclusive-ORoperations,Boolean algebra,examplesofICgates,numbersystems-binary,signedbinary,octalhexadecimalnumber,binary arithmetic, one’s and two’s complements arithmetic, codes, error detecting and correcting codes, characteristics of digital lCs, digital logic families, TTL, Schottky TTL and CMOS logic, interfacing CMOS and TTL, Tri-state logic. \n" +
                "\n" +
                "Module 2: Combinational Digital Circuits (7Hours) \n" +
                "\n" +
                "Standard representation for logic functions, K-map representation, simplification of logic functions using K-map, minimization of logical functions. Don’t care conditions, Multiplexer, DeMultiplexer/Decoders, Adders, Sub tractors, BCD arithmetic, carry look ahead adder, serialadder, ALU, elementary ALU design, popular MSI chips, digital comparator, parity checker/generator, code converters, priority encoders, decoders/drivers for display devices, Q-M method off unction realization. \n" +
                "\n" +
                "Module 3: Sequential circuits and systems (7Hours) \n" +
                "\n" +
                "A 1-bit memory, the circuit properties of Bistable latch, the clocked SR flip flop, J- K-T andDtypesflipflops,applicationsofflipflops,shiftregisters,applicationsofshiftregisters,serialtoparallel converter, parallel to serial converter, ring counter, sequence generator, ripple (Asynchronous) counters, synchronous counters, counters design using flip flops, special counter IC’s, asynchronous sequential counters, applications of counters. \n" +
                "\n" +
                "Module 4: A/D and D/A Converters (7Hours)\n" +
                "\n" +
                " Digital to analog converters: weighted resistor/converter, R-2R Ladder D/A converter, specifications for D/A converters, examples of D/A converter lCs, sample and hold circuit, analog to digital converters: quantization and encoding, parallel comparator A/D converter, successive approximation A/D converter, counting A/D converter, dual slope A/D converter, A/D converter using voltagetofrequencyandvoltagetotimeconversion,specificationsofA/Dconverters, example of A/D converter ICs \n" +
                "\n" +
                "Module 5: Semiconductor memories and Programmable logic devices. (7Hours)\n" +
                "\n" +
                " Memory organization and operation, expanding memory size, classification and characteristics of memories, sequential memory, read only memory (ROM), read and write memory(RAM), content addressable memory (CAM), charge de coupled device memory (CCD), commonly used memory chips, ROM as a PLD, Programmable logic array, Programmable array logic, complex Programmable logic devices (CPLDS), Field Programmable Gate Array (FPGA). \n" +
                "\n" +
                "Text/References: \n" +
                "\n" +
                "1. R. P. Jain, \"Modern Digital Electronics\", McGraw Hill Education,2009. \n" +
                "\n" +
                "2. M. M. Mano, \"Digital logic and Computer design\", Pearson Education India,2016. \n" +
                "\n" +
                "3. A. Kumar, \"Fundamentals of Digital Circuits\", Prentice Hall India,2016. \n" +
                "\n" +
                "PCC-EE09: Digital Electronics Laboratory (0:0:2 – 1 credit) Hands-on experiments related to the course contents of EE07. .");


        List<String> ElectricalMachinesTwo = Arrays.asList("Course Outcomes: \n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to \n" +
                "\n" +
                "• Understand the concepts of rotating magnetic fields. \n" +
                "\n" +
                "• Understand the operation of acmachines. \n" +
                "\n" +
                "• Analyse performance characteristics of acmachines. \n" +
                "\n" +
                "Module 1: Fundamentals of AC machine windings (8 Hours) \n" +
                "\n" +
                "Physical arrangement of windings in stator and cylindrical rotor; slots for windings; single-turn coil – active portion and overhang; full- pitch coils, concentrated winding, distributed winding, winding axis, 3D visualization of the above winding types, Air-gap MMF distribution with fixed current through winding- concentrated and distributed, Sinusoidally distributed winding, winding distribution factor \n" +
                "\n" +
                "Module 2: Pulsating and revolving magnetic fields (4 Hours) \n" +
                "\n" +
                "Constant magnetic field, pulsating magnetic field - alternating current in windings with spatial displacement, Magnetic field produced by a single winding - fixed current and alternating current Pulsating fields produced by spatially displaced windings, Windings spatially shifted by 90 degrees, Additionofpulsatingmagneticfields,Threewindingsspatiallyshiftedby120degrees(carryingthreephase balanced currents), revolving magnetic field.\n" +
                "\n" +
                " Module 3: Induction Machines (12 Hours)\n" +
                "\n" +
                " Construction, Types (squirrel cage and slip-ring), Torque Slip Characteristics, Starting and Maximum Torque. Equivalent circuit. Phasor Diagram, Losses and Efficiency. Blocked rotor test, No- Load test, Determination of Parameters and power flow diagram. Effect of parameter variation on torque speed characteristics (variation of rotor and stator resistances, stator voltage, frequency). Methods of starting, braking and speed control for induction motors. Generator operation. Self-excitation. Doubly-Fed Induction Machines. \n" +
                "\n" +
                "Module 4: Single-phase induction motors (6 Hours)\n" +
                "\n" +
                " Constructional features, double revolving field theory, equivalent circuit, determination of parameters. Split-phase starting methods and applications. Methods of starting using auxiliary winding, development of equivalent circuit. No-Load and Blocked Rotor tests. \n" +
                "\n" +
                "Module 5: Special Machines (10 Hours)\n" +
                "\n" +
                " Basics of Hysteresis motor, Switched Reluctance motor, Stepper motor, Brushless DC motor Constructional features, cylindrical rotor synchronous machine - generated EMF, equivalent circuit and phasor diagram, armature reaction, synchronous impedance, voltage regulation. Operating characteristics of synchronous machines, V-curves. Salient pole machine – two reaction theory, analysis of phasor diagram, power angle characteristics. Parallel operation of alternators - synchronization and load division. \n" +
                "\n" +
                "Text/References:\n" +
                "\n" +
                " 1. A. E. Fitzgerald and C. Kingsley, \"Electric Machinery”, McGraw Hill Education,2013. \n" +
                "\n" +
                "2. M. G. Say, “Performance and design of AC machines”, CBS Publishers,2002.\n" +
                "\n" +
                " 3. P. S. Bimbhra, “Electrical Machinery”, Khanna Publishers,2011. \n" +
                "\n" +
                "4. I. J. Nagrath and D. P. Kothari, “Electric Machines”, McGraw Hill Education,2010. \n" +
                "\n" +
                "5. A. S. Langsdorf, “Alternating current machines”, McGraw Hill Education,1984. \n" +
                "\n" +
                "6. P. C. Sen, “Principles of Electric Machines and Power Electronics”, John Wiley & Sons,2007. \n" +
                "\n" +
                "PCC-EE11: Electrical Machines Laboratory– II (0:0:2 – 1 credit) Hands-on experiments related to the course contents of EE10..");


        List<String> ElectricalAndElectronicMeasurement = Arrays.asList(" Course Outcomes: \n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to: \n" +
                "\n" +
                "• work on of various instruments and equipments used for the measurement of various electrical engineering \n" +
                "\n" +
                "• analyze and solve the varieties of problems and issues coming up in the vast field of electrical measurements \n" +
                "\n" +
                "• to think in terms of innovative ideas to improve the existing technology in the field of measurements in terms of accuracy, cost, durability and user friendliness \n" +
                "\n" +
                "Module 1: Measurement and Error (8 Hours)\n" +
                "\n" +
                " Measurement and Error: Definition, Accuracy and Precision, Significant Figures, Types of Errors. Standards of Measurement: Classification of Standards, Electrical Standards, IEEE Standards. Types of measuring instrument: Ammeter and Voltmeter: Derivation for Deflecting Torque of; PMMC, MI (attraction and repulsion types), Electro Dynamometer and Induction type Ammetersand Voltmeters. Energy meters and wattmeter.: Construction, Theory and Principle of operation of Electro-Dynamometer and Induction type wattmeter, compensation, creep, error, testing, Single Phase and Poly phase Induction type Watt-hour meters. Frequency Meters: Vibrating reed type, electrical resonance type, Power Factor Meters. \n" +
                "\n" +
                "Module 2: Measurement of Resistance, Inductance and Capacitance: (8 Hrs)\n" +
                "\n" +
                " Resistance: Measurement of Low Resistance by Kelvin’s Double Bridge, Measurement of Medium Resistance, Measurement of High Resistance, Measurement of Resistance of Insulating Materials, Portable Resistance Testing set (Megohmmeter), Measurement of Insulation Resistance when Power is ON, Measurement of Resistance of Earth Connections. Inductance: Measurement of Self Inductance by Ammeter and Voltmeter, and AC Bridges(Maxwell’s, Hay’s, & Anderson Bridge), Measurement of Mutual Inductance by Felici’s Method, and as Self Inductance. Capacitance: Measurement of Capacitance by Ammeter and Voltmeter, and AC Bridges (Owen’s, Schering & Wien’s Bridge), Screening of Bridge Components and Wagnor Earthing Device. \n" +
                "\n" +
                "Module 3: (8 Hrs) \n" +
                "\n" +
                "Galvanometer: (5 Hrs) Construction, Theory and Principle of operation of D’Arsonval, Vibration(Moving Magnet & Moving Coil types), and Ballistic Galvanometer, Influence of Resistance on Damping, Logarithmic decrement, Calibration of Galvanometers, Galvanometer Constants, Measurement of Flux and Magnetic Field by using Galvanometers. Potentiometer: Construction, Theory and Principle of operation of DC Potentiometers(Crompton, Vernier, Constant Resistance, & Deflection Potentiometer), and AC Potentiometers (Drysdale-Tinsley & Gall-Tinsley Potentiometer). \n" +
                "\n" +
                "Module 4 :(8 Hrs) \n" +
                "\n" +
                "Current Transformer and Potential Transformer :(3 Hrs) Construction, Theory, Characteristics and Testing of CTs and PTs. Electronic Instruments for Measuring Basic Parameters:(2 Hrs) Amplified DC Meters, AC Voltmeters using Rectifiers, True RMS Voltmeter, Considerations for choosing an Analog Voltmeter, Digital Voltmeters (Block Diagrams only), Q-meter Oscilloscope:(3 Hrs) Block Diagrams, Delay Line, Multiple Trace, Oscilloscope Probes, Oscilloscope Techniques, Introduction to Analog and Digital Storage Oscilloscopes, Measurement of Frequency, Phase Angle, and Time Delay using Oscilloscope \n" +
                "\n" +
                "Text/References: \n" +
                "\n" +
                "1. Electrical Measurements and Measuring Instruments – Golding & Widdis – 5th Edition, Reem Publication. \n" +
                "\n" +
                "2. Modern Electronic Instrumentation and Measurement Techniques – Helfrick & Cooper – Pearson Education. \n" +
                "\n" +
                "3. A Course in Electrical and Electronic Measurements and Instrumentation – A K Sawhney – Dhanpat Rai & Co. \n" +
                "\n" +
                "4. Electronic Instrumentation – H C Kalsi – 2nd Edition, Tata McGraw Hill. 5. Electronic Measurement and Instrumentation – Oliver & Cage – Tata McGraw Hill. .");


        List<String> ElectricalAndElectronicMeasurementLAB = Arrays.asList("Course Outcomes: \n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to \n" +
                "\n" +
                "1. Design and validate DC and AC bridges. \n" +
                "\n" +
                "2. Analyze the dynamic response and the calibration of few instruments. \n" +
                "\n" +
                "3. Learn about various measurement devices, their characteristics, their operation and their limitations.\n" +
                "\n" +
                " 4. Understand statistical data analysis. \n" +
                "\n" +
                "5. Understand computerized data acquisition. \n" +
                "\n" +
                "Lectures/Demonstrations: \n" +
                "\n" +
                "1. Concepts relating to Measurements: True value, Accuracy, Precision, Resolution, Drift, Hysteresis, Dead-band, Sensitivity. \n" +
                "\n" +
                "2. Errors in Measurements. Basic statistical analysis applied to measurements: Mean, Standard Deviation, Six-sigma estimation, Cp, Cpk. \n" +
                "\n" +
                "3. Sensors and Transducers for physical parameters: temperature, pressure, torque, flow. Speed and Position Sensors. \n" +
                "\n" +
                "4. Current and Voltage Measurements. Shunts, Potential Dividers. Instrument Transformers, Hall Sensors. \n" +
                "\n" +
                "5. Measurements of R, L and C. \n" +
                "\n" +
                "6. Digital Multi-meter, True RMS meters, Clamp-on meters, Meggers. \n" +
                "\n" +
                "7. Digital Storage Oscilloscope. \n" +
                "\n" +
                "Experiments \n" +
                "\n" +
                "1. Measurement of a batch of resistors and estimating statistical parameters. \n" +
                "\n" +
                "2. Measurement of L using a bridge technique as well as LCR meter. \n" +
                "\n" +
                "3. Measurement of C using a bridge technique as well as LCR meter. \n" +
                "\n" +
                "4. Measurement of Low Resistance using Kelvin’s double bridge. \n" +
                "\n" +
                "5. Measurement of High resistance and Insulation resistance using Megger. \n" +
                "\n" +
                "6. Usage of DS of orsteadystateperiodicwaveformsproducedbyafunctiongenerator.Selection of trigger source and trigger level, selection of time-scale and voltage scale. Bandwidth of measurement and sampling rate. \n" +
                "\n" +
                "7. Download of one-cycle data of a periodic waveform from a DSO and use values to compute the RMS values using a C program. \n" +
                "\n" +
                "8. Usage of DSO to capture transients like a step change in R-L-C circuit. \n" +
                "\n" +
                "9. Current Measurement using Shunt, CT, and Hall Sensor. .");


        List<String> SignalAndSystems = Arrays.asList("Course Outcomes: \n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to \n" +
                "\n" +
                "• Understand the concepts of continuous time and discrete time systems.\n" +
                "\n" +
                " • Analyse systems in complex frequency domain.\n" +
                "\n" +
                " • Understand sampling theorem and its implications. \n" +
                "\n" +
                "Module 1: Introduction to Signals and Systems (3 hours):\n" +
                "\n" +
                " Signals and systems as seen in everyday life, and in various branches of engineering and science. Signal properties: periodicity, absolute integrability, determinism and stochastic character. Some special signals of importance: the unit step, the unit impulse, the sinusoid, the complex exponential, some special time-limited signals; continuous and discrete time signals, continuous and discrete amplitude signals. System properties: linearity: additivity and homogeneity, shiftinvariance, causality, stability, realizability. Examples. \n" +
                "\n" +
                "Module 2: Behavior of continuous and discrete-time LTI systems (8 hours)\n" +
                "\n" +
                " Impulse response and step response, convolution, input-output behavior with a periodic convergent inputs, cascade interconnections. Characterization of causality and stability of LTI systems. System representation through differential equations and difference equations. Statespace Representation of systems. State-Space Analysis, Multi-input, multi-output representation. State Transition Matrix and its Role. Periodic inputs to an LTI system, the notion of a frequency response and its relation to the impulse response. \n" +
                "\n" +
                "Module 3: Fourier, Laplace and z- Transforms (10 hours) \n" +
                "\n" +
                "Fourier series representation of periodic signals, Wave form Symmetries, Calculation of Fourier Coefficients. Fourier Transform, convolution/multiplication and their effect in the frequency domain, magnitude and phase response, Fourier domain duality. The Discrete-Time Fourier Transform (DTFT) and the Discrete Fourier Transform (DFT). Parseval's Theorem. Review of the Laplace Transform for continuous time signals and systems, system functions, poles and zeros of system functions and signals, Laplace domain analysis, solution to differential equations and system behavior. The z-Transform for discrete time signals and systems, system functions, poles and zeros of systems and sequences, z- domain analysis. \n" +
                "\n" +
                "Module 4: Sampling and Reconstruction (4 hours) \n" +
                "\n" +
                "The Sampling Theorem and its implications. Spectra of sampled signals. Reconstruction: ideal interpolator, zero-order hold, first-order hold. Aliasing and its effects. Relation between continuous and discrete time systems. Introduction to the applications of signal and system theory: modulation for communication, filtering, feedback control systems. \n" +
                "\n" +
                "Text/References:\n" +
                "\n" +
                " 1. A. V. Oppenheim, A. S. Willskyand S. H. Nawab, “Signals and systems”, Prentice Hall India, 1997. \n" +
                "\n" +
                "2. J. G. Proakis and D. G. Manolakis, “Digital Signal Processing: Principles, Algorithms, and Applications”, Pearson, 2006. \n" +
                "\n" +
                "3. H. P. Hsu, “Signals and systems”, Schaum’s series, McGraw Hill Education, 2010. \n" +
                "\n" +
                "4. S. Haykin and B. V. Veen, “Signals and Systems”, John Wiley and Sons, 2007. \n" +
                "\n" +
                "5. A. V. Oppenheim and R. W. Schafer, “Discrete-Time Signal Processing”, Prentice Hall, 2009. \n" +
                "\n" +
                "6. M. J. Robert “Fundamentals of Signals and Systems”, McGraw Hill Education, 2007. \n" +
                "\n" +
                "7. B. P. Lathi, “Linear Systems and Signals”, Oxford University Press, 2009. .");


        List<String> MathematicsThree = Arrays.asList("Module 1: Basic Probability (12 hours)\n" +
                "\n" +
                "Probability spaces, conditional probability, independence; Discrete random variables, Independent random variables, the multinomial distribution, Poisson approximation to the binomial distribution, infinite sequences of Bernoulli trials, sums of independent random variables; Expectation of Discrete Random Variables, Moments, Variance of a sum, Correlation coefficient, Chebyshev's Inequality.\n" +
                "\n" +
                "Module 2: Continuous Probability Distributions (4 hours)\n" +
                "\n" +
                "Continuous random variables and their properties, distribution functions and densities, normal, exponential and gamma densities.\n" +
                "\n" +
                "Module 3: Bivariate Distributions (4 hours)\n" +
                "\n" +
                "Bivariate distributions and their properties, distribution of sums and quotients, conditional densities, Bayes' rule.\n" +
                "\n" +
                "Module 4: Basic Statistics (8 hours)\n" +
                "\n" +
                "Measures of Central tendency: Moments, skewness and Kurtosis - Probability distributions: Binomial, Poisson and Normal - evaluation of statistical parameters for these three distributions, Correlation and regression – Rank correlation.\n" +
                "\n" +
                "Module 5: Applied Statistics (8 hours)\n" +
                "\n" +
                "Curve fitting by the method of least squares- fitting of straight lines, second degree parabolas and more general curves. Test of significance: Large sample test for single proportion, difference of proportions, single mean, difference of means, and difference of standard deviations.\n" +
                "\n" +
                "Module 6: Small samples (4 hours)\n" +
                "\n" +
                "Test for single mean, difference of means and correlation coefficients, test for ratio of variances - Chi\u0002square test for goodness of fit and independence of attributes.\n" +
                "\n" +
                "Text / References:\n" +
                "\n" +
                "1. E. Kreyszig, “Advanced Engineering Mathematics”, John Wiley & Sons, 2006.\n" +
                "\n" +
                "2. P. G. Hoel, S. C. Port and C. J. Stone, “Introduction to Probability Theory”, Universal Book \n" +
                "\n" +
                "Stall, 2003.\n" +
                "\n" +
                "3. S. Ross, “A First Course in Probability”, Pearson Education India, 2002.\n" +
                "\n" +
                "4. W. Feller, “An Introduction to Probability Theory and its Applications”, Vol. 1, Wiley, 1968.\n" +
                "\n" +
                "5. N.P. Bali and M. Goyal, “A text book of Engineering Mathematics”, Laxmi Publications, 2010.\n" +
                "\n" +
                "6. B.S. Grewal, “Higher Engineering Mathematics”, Khanna Publishers, 2000.\n" +
                "\n" +
                "7. T. Veerarajan, “Engineering Mathematics”, Tata McGraw-Hill, New Delhi, 2010..");


        List<String> Biology = Arrays.asList("Module 1: Introduction (2 hours)\n" +
                "\n" +
                "Purpose: To convey that Biology is as important a scientific discipline as Mathematics, Physics andChemistry. Bring out the fundamental differences between science and engineering by drawing acomparison between eye and camera, Bird flying and aircraft. Mention the most exciting aspect ofbiology as an independent scientific discipline. Why we need to study biology? Discuss how biological observations of 18th Century that lead to major discoveries. Examples from Brownian motion and the origin of thermodynamics by referring to the original observation of Robert Brown and Julius Mayor. These examples will highlight the fundamental importance of observations in any scientific inquiry.\n" +
                "\n" +
                "Module 2: Classification (3 hours)\n" +
                "\n" +
                "Purpose: To convey that classification per se is not what biology is all about. The underlying criterion, such as morphological, biochemical or ecological be highlighted. Hierarchy of life forms at phenomenological level. A common thread weaves this hierarchy Classification. Discuss classification based on (a) cellularity\u0002Unicellular or multicellular (b) ultrastructure- prokaryotes or eucaryotes. (c) energy and Carbon utilization -Autotrophs, heterotrophs, lithotropes (d) Ammonia excretion – aminotelic, uricotelic, ureotelic (e) Habitata- acquatic or terrestrial (e) Molecular taxonomy- three major kingdoms of life. A given organism can come under different category based on classification. Model organisms for the study of biology come from different groups. E.coli, S.cerevisiae, D. Melanogaster, C. elegance, A. Thaliana, M. musculus\n" +
                "\n" +
                "Module 3: Genetics (4 hours)\n" +
                "\n" +
                "Purpose: To convey that “Genetics is to biology what Newton’s laws are to Physical Sciences”. Mendel’s laws, Concept of segregation and independent assortment. Concept of allele. Gene mapping, Gene interaction, Epistasis. Meiosis and Mitosis be taught as a part of genetics. Emphasis to be give not to the mechanics of cell division nor the phases but how genetic material passes from parent to offspring. Concepts of recessiveness and dominance. Concept of mapping of phenotype to genes. Discuss about the single gene disorders in humans. Discuss the concept of complementation using human genetics.\n" +
                "\n" +
                "Module 4: Biomolecules (4 hours)\n" +
                "\n" +
                "Purpose: To convey that all forms of life has the same building blocks and yet the manifestations are as diverse as one can imagine. Molecules of life. In this context discuss monomeric units and polymeric structures. Discuss about sugars, starch and cellulose. Amino acids and proteins. Nucleotides and DNA/RNA. Two carbon units and lipids.\n" +
                "\n" +
                "Module 5: Enzymes (4 Hours)\n" +
                "\n" +
                "Purpose: To convey that without catalysis life would not have existed on earth. Enzymology: How to monitor enzyme catalysed reactions. How does an enzyme catalyse reactions? Enzyme classification. Mechanism of enzyme action. Discuss at least two examples. Enzyme kinetics and kinetic parameters. Why should we know these parameters to understand biology? RNA catalysis.\n" +
                "\n" +
                "Module 6: Information Transfer (4 hours)\n" +
                "\n" +
                "Purpose: The molecular basis of coding and decoding genetic information is universal. Molecularbasis of information transfer. DNA as a genetic material. Hierarchy of DNA structure- from singlestranded to double helix to nucleosomes. Concept of genetic code. Universality and degeneracy ofgenetic code. Define gene in terms of complementation and recombination.\n" +
                "\n" +
                "Module 7: Macromolecular analysis (5 hours)\n" +
                "\n" +
                "Purpose: To analyse biological processes at the reductionistic level. Proteins- structure and function.Hierarch in protein structure. Primary secondary, tertiary and quaternary structure. Proteins as enzymes, transporters, receptors and structural elements.\n" +
                "\n" +
                "Module 8: Metabolism (4 hours)\n" +
                "\n" +
                "Purpose: The fundamental principles of energy transactions are the same in physical and biological world. Thermodynamics as applied to biological systems. Exothermic and endothermic versus endergonic and exergonic reactions. Concept of Keq and its relation to standard free energy. Spontaneity. ATP as an energy currency. This should include the breakdown of glucose to CO2 + H2O (Glycolysis and Krebs cycle) and synthesis of glucose from CO2 and H2O (Photosynthesis). Energy yielding and energy consuming reactions. Concept of Energy charge.\n" +
                "\n" +
                "Module 9. Microbiology (3 hours)\n" +
                "\n" +
                "Concept of single celled organisms. Concept of species and strains. Identification and classification of microorganisms. Microscopy. Ecological aspects of single celled organisms. Sterilization and media compositions. Growth kinetics.\n" +
                "\n" +
                "Text / References:\n" +
                "\n" +
                "1. N. A. Campbell, J. B. Reece, L. Urry, M. L. Cain and S. A. Wasserman, “Biology: Aglobal \n" +
                "\n" +
                "approach”, Pearson Education Ltd, 2014.\n" +
                "\n" +
                "2. E. E. Conn, P. K. Stumpf, G. Bruening and R. H. Doi, “Outlines of Biochemistry”, John Wiley \n" +
                "\n" +
                "and Sons, 2009.\n" +
                "\n" +
                "3. D. L. Nelson and M. M. Cox, “Principles of Biochemistry”, W.H. Freeman and Company, \n" +
                "\n" +
                "2012.\n" +
                "\n" +
                "4. G. S. Stent and R. Calendar, “Molecular Genetics”, Freeman and company, 1978.\n" +
                "\n" +
                "5. L. M. Prescott, J. P. Harley and C. A. Klein, “Microbiology”, McGraw Hill HigherEducation, \n" +
                "\n" +
                "2005.\n" +
                "\n" +
                "Course Outcomes\n" +
                "\n" +
                "After studying the course, the student will be able to:\n" +
                "\n" +
                "\uF0B7 Describe how biological observations of 18th Century that lead to majordiscoveries.\n" +
                "\n" +
                "\uF0B7 Convey that classification per se is not what biology is all about but highlight the underlying \n" +
                "\n" +
                "criteria, such as morphological, biochemical and ecological\n" +
                "\n" +
                "\uF0B7 Highlight the concepts of recessiveness and dominance during the passage of genetic material \n" +
                "\n" +
                "from parent to offspring\n" +
                "\n" +
                "\uF0B7 Convey that all forms of life have the same building blocks and yet the manifestations are as \n" +
                "\n" +
                "diverse as one can imagine\n" +
                "\n" +
                "\uF0B7 Classify enzymes and distinguish between different mechanisms of enzyme action.\n" +
                "\n" +
                "\uF0B7 Identify DNA as a genetic material in the molecular basis of information transfer.\n" +
                "\n" +
                "\uF0B7 Analyse biological processes at the reductionistic level\n" +
                "\n" +
                "\uF0B7 Apply thermodynamic principles to biological systems.\n" +
                "\n" +
                "\uF0B7 Identify and classify microorganisms..");


        List<Semester> fourthSemesters = new ArrayList<>();
        fourthSemesters.add(new Semester("Digital Electronics", DigitalElectronics));
        fourthSemesters.add(new Semester("Electrical Machines-II", ElectricalMachinesTwo));
        fourthSemesters.add(new Semester("Electrical And Electronic Measurement", ElectricalAndElectronicMeasurement));
        fourthSemesters.add(new Semester("Electrical And Electronic Measurement LAB", ElectricalAndElectronicMeasurementLAB));
        fourthSemesters.add(new Semester("Signal And Systems", SignalAndSystems));
        fourthSemesters.add(new Semester("Mathematics-III(Probability And Statics)", MathematicsThree));
        fourthSemesters.add(new Semester("Biology for Engineers", Biology));

        branches.add(new Branch("Semester 4", fourthSemesters));
        //4th Semester complete.....




        //5 Semester Start.........
        List<String> PowerSystem = Arrays.asList("Course Outcomes:\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "\uF0B7 Understand the concepts of power systems.\n" +
                "\n" +
                "\uF0B7 Understand the various power system components.\n" +
                "\n" +
                "\uF0B7 Evaluate fault currents for different types offaults.\n" +
                "\n" +
                "\uF0B7 Understand the generation of over-voltages and insulation coordination.\n" +
                "\n" +
                "\uF0B7 Understand basic protection schemes.\n" +
                "\n" +
                "\uF0B7 Understand concepts of HVdc power transmission and renewable energy generation.\n" +
                "\n" +
                "Module 1: Basic Concepts (4 hours)\n" +
                "\n" +
                "EvolutionofPowerSystemsandPresent-DayScenario.Structureofapowersystem: Bulk Power Grids and Micro-grids. Generation: Conventional and Renewable Energy Sources. Distributed Energy Resources. Energy Storage. Transmission and Distribution Systems: Line diagrams, transmission and distribution voltage levels and topologies (meshed and radial systems). Synchronous Grids and Asynchronous (DC) interconnections. Review of Three-phase systems. Analysis of simple three-phase circuits. Power Transfer in AC circuits and Reactive Power. Skin effect and Ferranti effect\n" +
                "\n" +
                "Module 2: Power System Components (15 hours)\n" +
                "\n" +
                "Overhead Transmission Lines and Cables: Electrical and Magnetic Fields around conductors, Corona. Parameters of lines and cables. Capacitance and Inductance calculations for simple configurations. Travelling-wave Equations. Sinusoidal Steady state representation of Lines: Short, medium and long lines. Power Transfer, Voltage profile and Reactive Power. Characteristics of transmission lines. Surge Impedance Loading. Series and Shunt Compensation of transmission lines.\n" +
                "\n" +
                "Transformers: Three-phase connections and Phase-shifts. Three-winding transformers, auto- transformers, Neutral Grounding transformers. Tap-Changing in transformers.\n" +
                "\n" +
                "Transformer Parameters. Single phase equivalent of three-phase transformers.\n" +
                "\n" +
                "Synchronous Machines: Steady-state performance characteristics. Operation when connected to infinite bus. Real and Reactive Power Capability Curve of generators. Typical waveform under balanced terminal short circuit conditions – steady state, transient and sub-transient equivalent circuits. Loads: Types, Voltage and Frequency Dependence of Loads. Per-unit System and per-unit calculations.\n" +
                "\n" +
                "Module 3: Over-voltages and Insulation Requirements (4 hours)\n" +
                "\n" +
                "Generation of Over-voltages: Lightning and Switching Surges. Protection against Over-voltages, Insulation Coordination. Propagation of Surges. Voltages produced by traveling surges. Bewley Diagrams.\n" +
                "\n" +
                "Module 4: Introduction to DC Transmission & Renewable Energy Systems (9 hours)\n" +
                "\n" +
                "DC Transmission Systems: Line-Commutated Converters (LCC) and Voltage Source\n" +
                "\n" +
                "Converters (VSC). LCC and VSC based dc link, Real Power Flow control in a dc link. Comparison of ac and dc transmission. Solar PV systems: I-V and P-V characteristics of PV panels, power electronic interface of PV to the grid. Wind Energy Systems: Power curve of wind turbine. Fixed and variable speed turbines. Permanent Magnetic Synchronous Generators and Induction Generators. Power Electronics interfaces of wind generators to the grid.\n" +
                "\n" +
                "Text/References:\n" +
                "\n" +
                "\uF0B7 J. Grainger and W. D. Stevenson, “Power System Analysis”, McGraw Hill Education, 1994.\n" +
                "\n" +
                "\uF0B7 O. I. Elgerd, “Electric Energy Systems Theory”, McGraw Hill Education, 1995.\n" +
                "\n" +
                "\uF0B7 A. R. Bergen and V. Vittal, “Power System Analysis”, Pearson Education Inc., 1999.\n" +
                "\n" +
                "\uF0B7 D. P. Kothari and I. J. Nagrath, “Modern Power System Analysis”, McGraw Hill Education, 2003.\n" +
                "\n" +
                "\uF0B7 B. M. Weedy, B. J. Cory, N. Jenkins, J. Ekanayake and G. Strbac, “Electric Power Systems”, Wiley,2012..");

        List<String> PowerSystemLAB = Arrays.asList("Power Systems – I Laboratory (0:0:2 – 1 credit)\n" +
                "\n" +
                "Hands-on experiments related to the course contents of EE14. Visits to power system installations (generation stations, EHV substations etc.) are suggested. Exposure to fault analysis and Electro- magnetic transient program (EMTP) and Numerical Relays are suggested.");

        List<String> ControlSystem = Arrays.asList("Course Outcomes:\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "\uF0B7 Understand the modelling of linear-time-invariant systems using transfer function and state- space representations.\n" +
                "\n" +
                "\uF0B7 Understand the concept of stability and its assessment for linear-time invariant systems.\n" +
                "\n" +
                "\uF0B7 Design simple feedback controllers.\n" +
                "\n" +
                "Module 1: Introduction to control problem (4 hours)\n" +
                "\n" +
                "Industrial Control examples. Mathematical models of physical systems. Control hardware and their models. Transfer function models of linear time-invariant systems. Feedback Control: Open-Loop and Closed-loop systems. Benefits of Feedback. Block diagram algebra. Signal flow graph\n" +
                "\n" +
                "Module 2: Time Response Analysis (10 hours)\n" +
                "\n" +
                "Standard test signals. Time response of first and second order systems for standard test inputs. Application of initial and final value theorem. Design specifications for second-order\n" +
                "\n" +
                "systems based on the time-response.\n" +
                "\n" +
                "Concept of Stability. Routh-Hurwitz Criteria. Relative Stability analysis. Root-Locus technique. Construction of Root-loci.\n" +
                "\n" +
                "Module 3: Frequency-response analysis (6 hours)\n" +
                "\n" +
                "Relationship between time and frequency response, Polar plots, Bode plots. Nyquist stability criterion. Relative stability using Nyquist criterion – gain and phase margin. Closed-loop frequency response.\n" +
                "\n" +
                "Module 4: Introduction to Controller Design (10 hours)\n" +
                "\n" +
                "Stability, steady-state accuracy, transient accuracy, disturbance rejection, insensitivity and robustness of control systems. Root-loci method of feedback controller design. Design specifications in frequency-domain. Frequency-domain methods of design. Application of Proportional, Integral and Derivative Controllers, Lead and Lag compensation in designs.\n" +
                "\n" +
                "Analog and Digital implementation of controllers.\n" +
                "\n" +
                "Module 5: State variable Analysis (6 hours)\n" +
                "\n" +
                "Concepts of state variables. State space model. Diagonalization of State Matrix. Solution of state equations. Eigen values and Stability Analysis. Concept of controllability and observability. Pole-placement by state feedback. Discrete-time systems. Difference Equations. State-space models of linear discrete-time systems. Stability of linear discrete-time systems.\n" +
                "\n" +
                "Text/References:\n" +
                "\n" +
                "\uF0B7 M. Gopal, “Control Systems: Principles and Design”, McGraw Hill Education, 1997.\n" +
                "\n" +
                "\uF0B7 B. C. Kuo, “Automatic Control System”, Prentice Hall, 1995.\n" +
                "\n" +
                "\uF0B7 K. Ogata, “Modern Control Engineering”, Prentice Hall, 1991.\n" +
                "\n" +
                "\uF0B7 I. J. Nagrath and M. Gopal, “Control Systems Engineering”, New Age International,2009.");

        List<String> ControlSystemLAB = Arrays.asList("Control Systems Laboratory (0:0:2 – 1 credit).");

        List<String> Microprocessor = Arrays.asList("Course Outcomes:\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "\uF0B7 Do assembly language programming.\n" +
                "\n" +
                "\uF0B7 Do interfacing design of peripherals like I/O, A/D, D/A, timer etc.\n" +
                "\n" +
                "\uF0B7 Develop systems using different microcontrollers.\n" +
                "\n" +
                "Module 1: Fundamentals of Microprocessors: (7 Hours)\n" +
                "\n" +
                "Fundamentals of Microprocessor Architecture. 8-bitMicroprocessor and Microcontroller architecture, Comparison of 8-bit microcontrollers, 16-bit and 32-bit microcontrollers. Definition of embedded system and its characteristics, Role of microcontroller sin embedded Systems. Overview of the 8051family.\n" +
                "\n" +
                "Module 2: The 8051 Architecture (8 Hours)\n" +
                "\n" +
                "InternalBlockDiagram,CPU,ALU,address,dataandcontrolbus,Workingregisters,SFRs, Clock and RESET circuits, Stack and Stack Pointer, Program Counter, I/O ports, Memory Structures, Data and Program Memory, Timing diagrams and Execution Cycles.\n" +
                "\n" +
                "Module 3: Instruction Set and Programming (8 Hours)\n" +
                "\n" +
                "Addressing modes: Introduction, Instruction syntax, Data types, Subroutines Immediate addressing, Register addressing, Direct addressing, Indirect addressing, Relative addressing, Indexed addressing, Bit inherent addressing, bit direct addressing. 8051 Instruction set, Instruction timings. Data transfer instructions, Arithmetic instructions, Logical instructions, Branch instructions, Subroutine instructions, Bit manipulation instruction. Assembly language programs, C language programs. Assemblers and compilers. Programming and debugging tools.\n" +
                "\n" +
                "Module 4: Memory and I/O Interfacing (6 Hours):\n" +
                "\n" +
                "Memory and I/O expansion buses, control signals, memory wait states. Interfacing of peripheral devices such as General Purpose I/O, ADC, DAC, timers, counters, memory devices.\n" +
                "\n" +
                "Module 5: External Communication Interface (6 Hours)\n" +
                "\n" +
                "Synchronous and Asynchronous Communication. RS232, SPI, I2C. Introduction and interfacing to protocols like Blue-tooth and Zig-bee.\n" +
                "\n" +
                "Module 6: Applications (6 Hours)\n" +
                "\n" +
                "LED, LCD and keyboard interfacing. Stepper motor interfacing, DC Motor interfacing, sensor interfacing.\n" +
                "\n" +
                "Text / References:\n" +
                "\n" +
                "\uF0B7 M. A.Mazidi, J. G. Mazidi and R. D. McKinlay, “The8051Microcontroller and Embedded Systems: Using Assembly and C”,Pearson Education,2007.\n" +
                "\n" +
                "\uF0B7 K. J. Ayala, “8051 Microcontroller”, Delmar CengageLearning,2004.\n" +
                "\n" +
                "\uF0B7 R. Kamal, “Embedded System”, McGraw HillEducation,2009.\n" +
                "\n" +
                "\uF0B7 R. S. Gaonkar, “, Microprocessor Architecture: Programming and Applications with the 8085”, Penram International Publishing,1996\n" +
                "\n" +
                "\uF0B7 D.A. Patterson and J.H. Hennessy, \"Computer Organization and Design: The Hardware/\uF0B7 D. V. Hall, “Microprocessors & Interfacing”, McGraw Hill Higher Education,1991..");

        List<String> MicroprocessorLAB = Arrays.asList("Microprocessor Laboratory (0:0:2 – 1 credit).");

        List<String> PowerElectronics = Arrays.asList("Course Outcomes: At the end of this course students will demonstrate the ability to \uF0B7 Understand the differences between signal level and power leveldevices. \uF0B7 Analyse controlled rectifier circuits. \uF0B7 Analyse the operation of DC-DC choppers. \uF0B7 Analyse the operation of voltage source inverters.\n" +
                "\n" +
                " Module 1: Power switching devices (8 Hours) Diode, Thyristor, MOSFET, IGBT: I-V Characteristics; Firing circuit for thyristor; Voltage and current commutation of a thyristor; Gate drive circuits for MOSFET and IGBT.\n" +
                "\n" +
                " Module 2: Thyristor rectifiers (7 Hours) Single-phase half-wave and full-wave rectifiers, Single-phase full-bridge thyristor rectifier with R- load and highly inductive load; Three-phase full-bridge thyristor rectifier with R-load and highly inductive load; Input current wave shape and power factor.\n" +
                "\n" +
                " Module 3: DC-DC converter (10 Hours) Elementary chopper with an active switch and diode, concepts of duty ratio and average voltage, power circuit of a buck converter, analysis and waveforms at steady state, duty ratio control of output voltage. Power circuit of a boost converter, analysis and waveforms at steady state, relation between duty ratio and average output voltage.\n" +
                "\n" +
                " Module 4: Single-phase and 3-phase voltage source inverter (14 Hours) Power circuit of single-phase voltage source inverter, switch states and instantaneous output voltage, square wave operation of the inverter, concept of average voltage over a switching cycle, bipolar sinusoidal modulation and unipolar sinusoidal modulation, modulation index and output voltage Power circuit of a three-phase voltage source inverter, switch states, instantaneous output voltages, average output voltages over a sub-cycle, three-phase sinusoidal modulation. Current Source Inverter Text/References: \uF0B7 M. H. Rashid, “Power electronics: circuits, devices, and applications”, Pearson Education India, 2009. \uF0B7 N. Mohan and T. M. Undeland, “Power Electronics: Converters, Applications and Design”, John Wiley & Sons, 2007. \uF0B7 R. W. Erickson and D. Maksimovic, “Fundamentals of Power Electronics”, Springer Science& Business Media, 2007. \uF0B7 L. Umanand, “Power Electronics: Essentials and Applications”, Wiley India, 2009..");

        List<String> PowerElectronicsLAB = Arrays.asList("Power Electronics Laboratory (0:0:2 – 1credit)..");

        List<String> ProgramElectiveFirst = Arrays.asList("PROGRAM ELECTIVE -I..");
        List<String> MOOCFirst = Arrays.asList("OE -I (MOOC) MOOCS / SWAYAM / NPTEL COURSES -I..");
        List<String> SummerEntrepreneurship = Arrays.asList("SUMMER ENTREPANEURSHIP -II..");
        List<String> GraduateEmployability = Arrays.asList("GRADUATE EMPLOYABILITY SKILLS AND COMPETATIVE COURSES (GATE, IES, ETC.)..");

        List<Semester> fifthSemesters = new ArrayList<>();
        fifthSemesters.add(new Semester("Power System-I", PowerSystem));
        fifthSemesters.add(new Semester("Power System LAB-I", PowerSystemLAB));
        fifthSemesters.add(new Semester("Control System", ControlSystem));
        fifthSemesters.add(new Semester("Control System LAB", ControlSystemLAB));
        fifthSemesters.add(new Semester("Microprocessor", Microprocessor));
        fifthSemesters.add(new Semester("Microprocessor LAB", MicroprocessorLAB));
        fifthSemesters.add(new Semester("Power Electronics", PowerElectronics));
        fifthSemesters.add(new Semester("Power Electronics LAB", PowerElectronicsLAB));
        fifthSemesters.add(new Semester("Program Elective-I", ProgramElectiveFirst));
        fifthSemesters.add(new Semester("MOOC/SWAYAM/NPTEL(Courses-I)", MOOCFirst));
        fifthSemesters.add(new Semester("Summer Entrepreneurship-II", SummerEntrepreneurship));
        fifthSemesters.add(new Semester("Graduate Employability Skills And Competitive Courses(GATE,IES,Etc.)", GraduateEmployability));

        branches.add(new Branch("Semester 5", fifthSemesters));
        //5th Semester Complete.......



        //6 Semester Start......
        List<String> PowerSystemTwo = Arrays.asList("Course Outcomes: \n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "Use numerical methods to analyse a power system in steady state. \n" +
                "\n" +
                "Understand stability constraints in a synchronous grid. \n" +
                "\n" +
                "Understand methods to control the voltage, frequency and power flow. \n" +
                "\n" +
                "Understand the monitoring and control of a power system. \n" +
                "\n" +
                "Understand the basics of power system economics. \n" +
                "\n" +
                "Module 1: Power Flow Analysis (7 hours) Review of the structure of a Power System and its components. Analysis of Power Flows: Formation of Bus Admittance Matrix. Real and reactive power balance equations at a node. Load and Generator Specifications. Application of numerical methods for solution of non-linear algebraic equations – Gauss Seidel and Newton-Raphson methods for the solution of the power flow equations. Computational Issues in Large-scale Power Systems. \n" +
                "\n" +
                "Module 2: Stability Constraints in synchronous grids (8 hours) Swing Equations of a synchronous machine connected to an infinite bus. Power angle curve. Description of the phenomena of loss of synchronism in a single-machine infinite bus system following a disturbance like a three—phase fault. Analysis using numerical integration of swing equations (using methods like Forward Euler, Runge-Kutta 4th order methods), as well as the Equal Area Criterion. Impact of stability constraintson Power System Operation. Effect of generation rescheduling and series compensation of transmission lines on stability. \n" +
                "\n" +
                "Module 3: Control of Frequency and Voltage (7 hours) Turbines and Speed-Governors, Frequency dependence of loads, Droop Control and Power Sharing. Automatic Generation Control. Generation and absorption of reactive power by various components of a Power System. Excitation System Control in synchronous generators, Automatic Voltage Regulators. Shunt Compensators, Static VAR compensators and STATCOMs. Tap Changing Transformers. Power flow control using embedded dc links, phase shifters and \n" +
                "\n" +
                "Module 4: Monitoring and Control (6 hours) Overview of Energy Control Centre Functions: SCADA systems. Phasor Measurement Units and Wide-Area Measurement Systems. State-estimation. System Security Assessment. Normal, Alert, Emergency, Extremis states of a Power System. Contingency Analysis. Preventive Control and Emergency Control. \n" +
                "\n" +
                "Module 5: Fault Analysis and Protection Systems (10 hours) Method of Symmetrical Components (positive, negative and zero sequences). Balanced and Unbalanced Faults. Representation of generators, lines and transformers in sequence networks. Computation of Fault Currents. Neutral Grounding. \n" +
                "\n" +
                "Text/References:\n" +
                "\n" +
                "1. J. Grainger and W. D. Stevenson, “Power System Analysis”, McGraw Hill Education,1994. \n" +
                "\n" +
                "2. O. I. Elgerd, “Electric Energy Systems Theory”, McGraw Hill Education,1995. \n" +
                "\n" +
                "3. A. R. Bergen and V. Vittal, “Power System Analysis”, Pearson Education Inc.,1999. \n" +
                "\n" +
                "4. D. P. Kothari and I. J. Nagrath, “Modern Power System Analysis”, McGraw Hill Education,2003.\n" +
                "\n" +
                "5. B. M. Weedy, B. J. Cory, N. Jenkins, J. Ekanayake and G. Strbac, “Electric Power Systems”, Wiley, 2012.");

        List<String> ProfessionalSkillDevelopment = Arrays.asList("Objectives of the course: \n" +
                "\n" +
                "1. To learn various interpersonal skills \n" +
                "\n" +
                "2. To help in developing various professionals skills. \n" +
                "\n" +
                "3. To cover the facets of verbal and non-verbal languages, public speech, reading gestures and body languages, preparing for group discussion and enhancing presentations skills. \n" +
                "\n" +
                "4. To enable learners to speak fluently and flawlessly in all kinds of communicative Contexts with speakers of all nationalities. \n" +
                "\n" +
                "Detail contents: \n" +
                "\n" +
                "Module 1 (Lecture 10 hrs.) Communication skills: Public speaking, Group discussion, Gestures and body language & professional presentation skills \n" +
                "\n" +
                "Module 2 (Lecture 10 hrs.)Interpersonal skills: Group dynamics, Negotiation skills, Leadership, Emotional intelligence \n" +
                "\n" +
                "Module 3 (Lecture 10 hrs) Employability and Corporate Skills: Time management and effective planning, Stress management, People skills, Team work, development of leadership qualities, Decision making and Negotiation skills, Positive attitude, Self-motivation, Professional ethics, Business etiquettes, balancing board room. \n" +
                "\n" +
                "Module 4 (Lecture 10 hrs) Business writing skills, Resume Writing. Interview Skills, Technical Presentation, Guest Lecture, Professional Ethics, Project Management, Entrepreneurship. \n" +
                "\n" +
                "Suggested reference books: \n" +
                "\n" +
                "1. “Personality Development and Soft Skills”, Barun Mitra, Oxford University Press. \n" +
                "\n" +
                "2. “Managing Soft Skills for Personality Development”, B.N. Ghosh, McGraw Hill. \n" +
                "\n" +
                "3. “Communication Skills and Soft Skills: An Integrated Approach”, E. Suresh Kumar, Pearson \n" +
                "\n" +
                "4. “Communication to Win”, Richard Denny, Kogan Page India Pvt. Ltd. \n" +
                "\n" +
                "Course outcomes \n" +
                "\n" +
                "1. Student can able to write their resume and can prepare for presentation, group discussion and interview. \n" +
                "\n" +
                "2. Student can develop interpersonal skills like negotiation and leadership skills. \n" +
                "\n" +
                "3. Students can develop Employability and Corporate Skills with proper time management and stress management. \n" +
                "\n" +
                "Students learn to practice the professional ethics, project management and Entrepreneurship ..");

        List<String> DigitalSignalProcessing = Arrays.asList("Module 1: Discrete-time signals and systems \n" +
                "Discrete time signals and systems: Sequences; representation of signals on orthogonal basis; \n" +
                "Representation of discrete systems using difference equations, Sampling and reconstruction of \n" +
                "signals - aliasing; Sampling theorem and Nyquist rate. (6 hours)\n" +
                "\n" +
                "Module 2: Z-transform \n" +
                "z-Transform, Region of Convergence, Analysis of Linear Shift Invariant systems using z\u0002transform, Properties of z-transform for causal signals, Interpretation of stability in z-domain, \n" +
                "Inverse z-transforms. (6 hours)\n" +
                "\n" +
                "Module 3: Discrete Fourier Transform \n" +
                "Frequency Domain Analysis, Discrete Fourier Transform (DFT), Properties of DFT, \n" +
                "Connvolution of signals, Fast Fourier Transform Algorithm, Parseval’s Identity, Implementation \n" +
                "of Discrete Time Systems. (10 hours)\n" +
                "\n" +
                "Module 4: Design of Digital filters \n" +
                "Design of FIR Digital filters: Window method, Park-McClellan's method. Design of IIR Digital \n" +
                "Filters: Butterworth, Chebyshev and Elliptic Approximations; Low-pass, Band-pass, Band-stop \n" +
                "and High- pass filters. Effect of finite register length in FIR filter design. Parametric and non\u0002parametric spectral estimation. Introduction to multi-rate signal processing. (12 hours)\n" +
                "\n" +
                "Module 5: Applications of Digital Signal Processing \n" +
                "Correlation Functions and Power Spectra, Stationary Processes, Optimal filtering using ARMA \n" +
                "Model, Linear Mean-Square Estimation, Wiener Filter. (6 hours)..");

        List<String> IntroductionVLSIDesign = Arrays.asList("Module 1: Introduction MOSFET, threshold voltage, current, Channel length modulation, body \n" +
                "bias effect and short channel effects, MOS switch, MOSFET capacitances, MOSFET models for \n" +
                "calculation- Transistors and Layout, CMOS layout elements, parasitics, wires and vias-design \n" +
                "rules-layout design SPICE simulation of MOSFET I-V characteristics and parameter extraction \n" +
                "(10 hours)\n" +
                "\n" +
                "Module 2: CMOS inverter, static characteristics, noise margin, effect of process variation, \n" +
                "supply scaling, dynamic characteristics, inverter design for a given VTC and speed, effect of \n" +
                "input rise time and fall time, static and dynamic power dissipation, energy & power delay \n" +
                "product, sizing chain of inverters, latch up effect-Simulation of static and dynamic \n" +
                "characteristics, layout, post layout simulation (10 hours)\n" +
                "\n" +
                "Module 3: Static CMOS design, Complementary CMOS, static properties, propagation delay, \n" +
                "Elmore delay model, power consumption, low power design techniques, logical effort for \n" +
                "transistor sizing, ratioed logic, pseudo NMOS inverter, DCVSL, PTL, DPTL & Transmission \n" +
                "gate logic, dynamic CMOS design, speed and power considerations, Domino logic and its \n" +
                "derivatives, C2MOS, TSPC registers, NORA CMOS-Course project (10 hours)\n" +
                "\n" +
                "Module 4: Circuit design considerations of Arithmetic circuits, shifter, CMOS memory design \n" +
                "SRAM and DRAM, BICMOS logic static and dynamic behavior Delay and power consumption \n" +
                "in BICMOS Logic.\n" +
                "(10 hours)..");

        List<String> ProgramElectiveTwo = Arrays.asList("COMPUTER ARCHITECTURE\n" +
                "INDUSTRIAL ELECTRICAL SYSTEMS \n" +
                "ELECTRICAL DRIVES");

        List<String> ProgramElectiveThree = Arrays.asList("COMPUTER ARCHITECTURE\n" +
                "INDUSTRIAL ELECTRICAL SYSTEMS \n" +
                "ELECTRICAL DRIVES");

        List<String> ElectronicsDesignLAB = Arrays.asList("Course Outcomes: \n" +
                "\n" +
                "At the end of the course, students will demonstrate the ability to \n" +
                "\n" +
                "Understand the practical issues related to practical implementation of applications using electronic circuits.\n" +
                "\n" +
                " Choose appropriate components, software and hardware platforms. \n" +
                "\n" +
                "Design a Printed Circuit Board, get it made and populate/solder it with components.\n" +
                "\n" +
                "Work as a team with other students to implement an application.\n" +
                "\n" +
                "Basic concepts on measurements; Noise in electronic systems; Sensors and signal conditioning circuits; Introduction to electronic instrumentation and PC based data acquisition; Electronic system design, Analog system design, Interfacing of analog and digital systems, Embedded systems, Electronic system design employing microcontrollers, CPLDs, and FPGAs, PCB design and layout; System assembly considerations. Group projects involving electronic hardware (Analog, Digital, mixed signal) leading to implementation of an application. \n" +
                "\n" +
                "Text/Reference Books \n" +
                "\n" +
                "1. A. S. Sedra and K. C. Smith, “Microelectronic circuits”, Oxford University Press, 2007. \n" +
                "\n" +
                "2. P. Horowitz and W. Hill, “The Art of Electronics”, Cambridge University Press, 1997. \n" +
                "\n" +
                "3. H. W. Ott, “Noise Reduction Techniques in Electronic Systems”, Wiley, 1989. \n" +
                "\n" +
                "4. W.C. Bosshart, “Printed Circuit Boards: Design and Technology”, Tata McGraw Hill, 1983. \n" +
                "\n" +
                "5. G.L. Ginsberg, “Printed Circuit Design”, McGraw Hill, 1991. .");

        List<String> PowerSystemTwoLAB = Arrays.asList(" Power Systems-II Laboratory (0:0:2 – 1 credit)..");

        List<String> MOOCSSecond = Arrays.asList("MOOCS / SWAYAM / NPTEL (COURSES - 2)..");

        List<String> WorkshopHeads = Arrays.asList("WORKSHOP/HEADS ON TRAINING/SOFT SKILL..");


        List<Semester> sixthSemesters = new ArrayList<>();
        sixthSemesters.add(new Semester("Power System-II", PowerSystemTwo));
        sixthSemesters.add(new Semester("Professional Skill Development", ProfessionalSkillDevelopment));
        sixthSemesters.add(new Semester("Digital Signal Processing", DigitalSignalProcessing));
        sixthSemesters.add(new Semester("Introduction to VLSI Design", IntroductionVLSIDesign));
        sixthSemesters.add(new Semester("Program Elective-II", ProgramElectiveTwo));
        sixthSemesters.add(new Semester("Program Elective-III", ProgramElectiveThree));
        sixthSemesters.add(new Semester("Electronics Design LAB", ElectronicsDesignLAB));
        sixthSemesters.add(new Semester("Power System LAB-II", PowerSystemTwoLAB));
        sixthSemesters.add(new Semester("MOOCS/SWAYAM/NPTEL (Courses-II)", MOOCSSecond));
        sixthSemesters.add(new Semester("Workshop/Heads on Training/Soft Skill", WorkshopHeads));

        branches.add(new Branch("Semester 6", sixthSemesters));
        //6th Semester Complete......



        //7 Semester Start.....
        List<String> HumanValuesAndEthics = Arrays.asList("Course Outcome: \n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to \n" +
                "\n" +
                "Identify the core values that shape the ethical behavior of an engineer.\n" +
                "\n" +
                "To create awareness on professional ethics and Human Values.\n" +
                "\n" +
                "To appreciate the rights of others.\n" +
                "\n" +
                "Module 1 : HUMAN VALUES \n" +
                "\n" +
                "Morals, Values and Ethics – Integrity – Work Ethic – Service Learning – Civic Virtue – Respect for others – Living Peacefully – Caring – Sharing – Honesty – Courage – Valuing time – Co-operation – Commitment – Empathy – Self-confidence – Character – Spirituality – The role of engineers in modern society – Social expectations.\n" +
                "\n" +
                "Module II : ENGINEERING ETHICS \n" +
                "\n" +
                "Sense of ‘Engineering Ethics’ – Variety of moral issued – types of inquiry – moral dilemmas – moral autonomy – Kohlberg’s theory – Gilligan’s theory – Consensus and Controversy – Models of Professional Roles & Professionalism – theories about right action – Self-interest – customs and religion – uses of ethical theories.\n" +
                "\n" +
                "Module III : ENGINEERING AS SOCIAL EXPERIMENTATION \n" +
                "\n" +
                "Engineering as experimentation – engineers as responsible experimenters – Research ethics – Codes of ethics – Industrial Standard – Balanced outlook on law – the challenger case study.\n" +
                "\n" +
                "Module IV : SAFETY, RESPONSIBILITIES AND RIGHTS \n" +
                "\n" +
                "Safety and risk – assessment of safety and risk – Riysis – Risk benefit analysis and reducing risk – Govt. Regulator’s approach to risks – the three mile island and Chernobyl case studies & Bhopal – Threat of Nuclear Power, depletion of ozone, greenery effects – Collegiality and loyalty – respect for authority – collective bargaining – Confidentiality – conflicts of interest – occupation crime – professional rights – employees’ rights – Intellectual Property Rights (IPR) – discrimination.\n" +
                "\n" +
                "Module V : GLOBAL ISSUES \n" +
                "\n" +
                "Multinational corporations – Business ethics – Environmental ethics – computer ethics – Role in Technological Development – Weapons development – engineers as managers – consulting engineers – engineers as expert, witnesses and advisors – Honesty – Leadership – sample code of conduct ethics like ASME, ASCE, IEEE, Institution of Engineers (India), Indian Institute of Materials Management, Institution of Electronics and Telecommunication Engineers (IETE), India, etc.,\n" +
                "\n" +
                "Text / References: \n" +
                "\n" +
                "1. Mika Martin and Roland Scinger, ‘Ethics in Engineeering’, Pearson Education/Prentice Hall, New York 1996.\n" +
                "\n" +
                "2. Govindarajan M., Natarajan S., Senthil Kumar V. S., ‘Engineering Ethics’ Prentice Hall of India, New Delhi, 2004.\n" +
                "\n" +
                "3. Charles D. Fleddermann, ‘Ethics in Engineering’, Pearson Education/Prentice Hall, New Jersey, 2004 (Indian Reprint).\n" +
                "\n" +
                "4. Charles E. Harris, Michael S. Protchard and Michael J. Rabins, ‘Engineering Ethics – Concept and Cases’, Wadsworth Thompson Learning, United States, 2000 (Indian Reprint now available).\n" +
                "\n" +
                "5. ‘Concepts and Cases’, Thompson Learning (2000).\n" +
                "\n" +
                "6. John R. Boatright, ‘Ethics and Conduct of Business’, Pearson Education, New Delhi, 2003.\n" +
                "\n" +
                "7. Edmund G. Seebauer and Robert L. Barry, ‘Fundamentals of Ethics for Scientists and Engineers’, Oxford University of Press, Oxford, 2001..");

        List<String> PowerSystemProtection = Arrays.asList("Module 1: \n" +
                "Introduction and Components of a Protection System Principles of Power System Protection, Relays, Instrument transformers, Circuit Breakers.\n" +
                "\n" +
                "Module 2: \n" +
                "Faults and Over-Current Protection Review of Fault Analysis, Sequence Networks. Introduction to Overcurrent Protection and overcurrent relay co-ordination.\n" +
                "\n" +
                "Module 3: \n" +
                "Equipment Protection Schemes, Directional, Distance, Differential protection. Transformer and Generator protection. Bus bar Protection, Bus Bar arrangement schemes\n" +
                "\n" +
                "Module 4:\n" +
                "Digital Protection Computer-aided protection, Fourier analysis and estimation of Phasors from DFT. Sampling. aliasing issues\n" +
                "\n" +
                "Module 5: \n" +
                "Modeling and Simulation of Protection Schemes CTPT modeling and standards, Simulation of transients using Electro-Magnetic Transients (EMT) programs. Relay Testing\n" +
                "\n" +
                "Module 6: \n" +
                "System Protection Effect of Power Swings on Distance Relaying. System Protection Schemes. Under-frequency. under voltage and dfdt relays, Out-of-step protection, Synchro-phasors, Phasor \n" +
                "Measurement Units and Wide-Area Measurement Systems (WAMS). Application of WAMS for improving protection systems..");

        List<String> OpenElectiveFirst = Arrays.asList("DIGITAL SIGNAL PROCESSING\n" +
                "ELECTROMAGNETIC WAVES\n" +
                "COMPUTATIONAL ELECTROMAGNETICS\n" +
                "POWER PLANT ENGINEERING\n" +
                "ELECTRICAL ENGINEERING MATERIALS");

        List<String> OpenElectiveSecond = Arrays.asList("DIGITAL SIGNAL PROCESSING\n" +
                "ELECTROMAGNETIC WAVES\n" +
                "COMPUTATIONAL ELECTROMAGNETICS\n" +
                "POWER PLANT ENGINEERING\n" +
                "ELECTRICAL ENGINEERING MATERIALS");

        List<String> ProgramElectiveFour = Arrays.asList("DIGITAL SIGNAL PROCESSING\n" +
                "ELECTROMAGNETIC WAVES\n" +
                "COMPUTATIONAL ELECTROMAGNETICS\n" +
                "POWER PLANT ENGINEERING\n" +
                "ELECTRICAL ENGINEERING MATERIALS");

        List<String> ProjectFirst = Arrays.asList("PROJECT -I..");

        List<String> Seminar = Arrays.asList("SEMINAR..");

        List<String> SummerEntrepreneurshipThree = Arrays.asList("SUMMER ENTREPRENEURSHIP -III..");


        List<Semester> seventhSemesters = new ArrayList<>();
        seventhSemesters.add(new Semester("Human Values And Ethics", HumanValuesAndEthics));
        seventhSemesters.add(new Semester("Power System Protection", PowerSystemProtection));
        seventhSemesters.add(new Semester("Open Elective-I", OpenElectiveFirst));
        seventhSemesters.add(new Semester("Open Elective-II", OpenElectiveSecond));
        seventhSemesters.add(new Semester("Program Elective-IV", ProgramElectiveFour));
        seventhSemesters.add(new Semester("Project-I", ProjectFirst));
        seventhSemesters.add(new Semester("Seminar", Seminar));
        seventhSemesters.add(new Semester("Summer Entrepreneurship-III", SummerEntrepreneurshipThree));

        branches.add(new Branch("Semester 7", seventhSemesters));
        //7th Semester Complete.....



        //8 Semester Start........
        List<String> OpenElectiveThree = Arrays.asList("COMPUTER NETWORKS\n" +
                "DIGITAL IMAGE PROCESSING\n" +
                "STRENGTH OF MATERIALS\n" +
                "FLUID MACHINERY\n\n" +
                "100808 Common Paper (EE/ECE) :\n" +
                "INTERNET OF THINGS\n" +
                "POWER ELECTRONICS\n" +
                "BIG DATA ANALYSIS\n" +
                "TRANSDUCERS AND SENSOR");

        List<String> OpenElectiveFour = Arrays.asList("COMPUTER NETWORKS\n" +
                "DIGITAL IMAGE PROCESSING\n" +
                "STRENGTH OF MATERIALS\n" +
                "FLUID MACHINERY\n\n" +
                "100808 Common Paper (EE/ECE) :\n" +
                "INTERNET OF THINGS\n" +
                "POWER ELECTRONICS\n" +
                "BIG DATA ANALYSIS\n" +
                "TRANSDUCERS AND SENSOR");

        List<String> ProgramElectiveFive = Arrays.asList("CONTROL SYSTEMS DESIGN\n" +
                "ELECTRICAL AND HYBRID VEHICLES\n" +
                "ADVANCED ELECTRIC DRIVES\n" +
                "HVDC TRANSMISSION SYSTEMS\n" +
                "POWER QUALITY AND FACTS\n" +
                "POWER SYSTEM DYNAMICS AND CONTROL");

        List<String> ProgramElectiveSix = Arrays.asList("CONTROL SYSTEMS DESIGN\n" +
                "ELECTRICAL AND HYBRID VEHICLES\n" +
                "ADVANCED ELECTRIC DRIVES\n" +
                "HVDC TRANSMISSION SYSTEMS\n" +
                "POWER QUALITY AND FACTS\n" +
                "POWER SYSTEM DYNAMICS AND CONTROL");

        List<String> ProjectTwo = Arrays.asList("PROJECT -II..");


        List<Semester> eightSemesters = new ArrayList<>();
        eightSemesters.add(new Semester("Open Elective-III", OpenElectiveThree));
        eightSemesters.add(new Semester("Open Elective-IV", OpenElectiveFour));
        eightSemesters.add(new Semester("Program Elective-V", ProgramElectiveFive));
        eightSemesters.add(new Semester("Program Elective-VI", ProgramElectiveSix));
        eightSemesters.add(new Semester("Project-II", ProjectTwo));

        branches.add(new Branch("Semester 8", eightSemesters));






        return branches;
    }
}


