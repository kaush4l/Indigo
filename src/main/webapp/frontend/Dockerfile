# base image
FROM node:12.2.0-alpine

# set working directory
WORKDIR /app

COPY . ./

EXPOSE 3000

RUN npm install

# start app
CMD ["npm", "run", "start"]
