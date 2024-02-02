# Factorial Js

This is a simple factorial application to explain the use of StrykerJs for Mutation Testing.

This project contains the application on the following structure:

    .
    ├── dist                              # Build version after compile
    ├── src
    |   └── index.ts                      # Factorial function
    ├── tests
    |   └── test.spec.ts                  # Factorial function test
    ├── .gitignore
    ├── jest.config.json                  # Jest configuration for tests
    ├── package-lock.json
    ├── package.json
    ├── README.md
    └── tsconfig.json

## Setup

To start this project, you need to install the dependencies via npm or similar with the command:

```console
npm i
```

## Commands

This project has the following commands:

### Execute the dev version

This command also generates a dist folder with the Js version of the code.

```console
npm run dev
```

### Build the project

```console
npm run start
```

### Execute the build version

```console
npm run start
```

### Execute tests with jest

This command also generates a coverage folder with the some coverage metrics for the src folder files.

```console
npm run test
```

### Execute mutation testing with StrykerJs

```console
npm run mutate
```
